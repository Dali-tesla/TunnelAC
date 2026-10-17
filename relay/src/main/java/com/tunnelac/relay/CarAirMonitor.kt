package com.tunnelac.relay

import android.app.dzt.CarAdditionInfo
import android.app.dzt.CarBaseInfo
import android.app.dzt.CarDoorInfo
import android.app.dzt.CarDynamicInfo
import android.app.dzt.CarEpsInfo
import android.app.dzt.CarFrontAirInfo
import android.app.dzt.CarFrontSeatInfo
import android.app.dzt.CarLearnKeyInfo
import android.app.dzt.CarMessageInfo
import android.app.dzt.CarOrignalTimeInfo
import android.app.dzt.CarRadarInfo
import android.app.dzt.CarRearAirInfo
import android.app.dzt.CarRearSeatInfo
import android.app.dzt.CarTpmsInfo
import android.app.dzt.ICANManager
import android.app.dzt.ICANSinkListener
import android.os.IBinder
import android.util.Log

/**
 * 차량 CAN 서비스("can")에서 앞좌석 공조 상태(CarFrontAirInfo)를 수신 전용으로 읽는다.
 * CanStatusViewer 와 같은 방식: ServiceManager.getService("can") → ICANManager.registerSinkListener,
 * 등록 직후와 [poll] 때 getCarFrontAirInfo() 로 현재 값을 조회한다. 차량으로 어떤 명령도 보내지 않는다.
 *
 * [onInnerLoop] 는 상태를 받을 때마다 호출된다(바인더 스레드일 수 있으므로 받는 쪽에서 스레드를 넘길 것).
 */
class CarAirMonitor(
    private val onInnerLoop: (Boolean) -> Unit,
    private val log: (String) -> Unit
) {
    @Volatile var connected = false
        private set

    private var manager: ICANManager? = null
    private var sink: ICANSinkListener? = null

    /** 연결돼 있지 않으면 연결을 시도한다. 성공하면 true. */
    @Synchronized
    fun ensureConnected(): Boolean {
        if (connected && manager != null) return true
        return try {
            val binder = getSystemBinder("can")
            if (binder == null) {
                log("감시: 'can' 서비스 없음")
                false
            } else {
                val mgr = ICANManager.Stub.asInterface(binder)
                val listener = buildSink()
                mgr.registerSinkListener(listener)
                manager = mgr
                sink = listener
                connected = true
                log("감시: CAN 서비스 연결·수신 등록 완료")
                true
            }
        } catch (e: Throwable) {
            log("감시 연결 실패: ${e.javaClass.simpleName}: ${e.message}")
            drop()
            false
        }
    }

    /** 현재 값을 한 번 조회한다(수신 콜백이 끊겨도 값을 놓치지 않기 위한 보조 수단). */
    fun poll() {
        if (!ensureConnected()) return
        try {
            manager?.carFrontAirInfo?.let { onInnerLoop(it.isInnerLoop) }
        } catch (e: Throwable) {
            log("감시 조회 실패 → 재연결 예정: ${e.javaClass.simpleName}")
            drop()
        }
    }

    @Synchronized
    fun stop() {
        try {
            val m = manager
            val s = sink
            if (m != null && s != null) m.unregisterSinkListener(s)
        } catch (_: Throwable) {
        }
        drop()
    }

    @Synchronized
    private fun drop() {
        manager = null
        sink = null
        connected = false
    }

    private fun getSystemBinder(name: String): IBinder? {
        val cls = Class.forName("android.os.ServiceManager")
        return cls.getMethod("getService", String::class.java).invoke(null, name) as IBinder?
    }

    private fun buildSink() = object : ICANSinkListener.Stub() {
        override fun notifyCarFrontAirInfo(info: CarFrontAirInfo?) {
            if (info != null) onInnerLoop(info.isInnerLoop)
        }

        override fun notifyCarRearAirInfo(info: CarRearAirInfo?) {}
        override fun notifyCarFrontSeatInfo(info: CarFrontSeatInfo?) {}
        override fun notifyCarRearSeatInfo(info: CarRearSeatInfo?) {}
        override fun notifyCarRadarInfo(info: CarRadarInfo?) {}
        override fun notifyCarEpsInfo(info: CarEpsInfo?) {}
        override fun notifyCarDoorInfo(info: CarDoorInfo?) {}
        override fun notifyCarAdditionInfo(info: CarAdditionInfo?) {}
        override fun notifyCarBaseInfo(info: CarBaseInfo?) {}
        override fun notifyCarDynamicInfo(info: CarDynamicInfo?) {}
        override fun notifyCarOrignalTimeInfo(info: CarOrignalTimeInfo?) {}
        override fun notifyCarTpmsInfo(info: CarTpmsInfo?) {}
        override fun notifyCarLearnKeyInfo(info: CarLearnKeyInfo?) {}
        override fun notifyCarMessageInfo(info: CarMessageInfo?) {}
        override fun notifyCarCanVersion(version: String?) {}
        override fun notifyCarDriverKeyInfo(key: Int, value: Int) {}
    }

    companion object {
        private const val TAG = "CarAirMonitor"
    }
}
