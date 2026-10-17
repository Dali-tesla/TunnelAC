package com.tunnelac.relay

import android.content.Context
import android.util.Log

/**
 * 리어 디스플레이 ROM 의 공조 제어 서비스(android.app.dzt.CANManager)를 리플렉션으로 호출한다.
 * SDK 에 없는 프레임워크 클래스이므로 컴파일 의존 없이 리플렉션으로 접근한다.
 *
 * 호출 규약(테스트 앱에서 검증됨):
 *   can = context.getSystemService("can")
 *   can.requestCarCommand4(1 /*FRONT_AIR*/, 7 /*IN_LOOP*/, c /*1=RECIRC,2=FRESH,3=AUTO*/, 1 /*BTN_DOWN*/)
 *   can.requestCarCommand4(1, 7, c, 0 /*BTN_UP*/)
 */
object CanSender {

    data class Result(val ok: Boolean, val message: String)

    @Volatile private var cachedService: Any? = null
    @Volatile private var cachedMethod: java.lang.reflect.Method? = null

    fun send(ctx: Context, canCode: Int): Result {
        if (canCode !in 1..3) return Result(false, "유효하지 않은 코드: $canCode")
        return try {
            val can = getService(ctx) ?: return Result(false, "CAN 서비스 없음 (접근 불가)")
            val m = getMethod(can)
            m.invoke(can, 1, 7, canCode, 1) // BTN_DOWN
            m.invoke(can, 1, 7, canCode, 0) // BTN_UP
            Result(true, "requestCarCommand4(1,7,$canCode,down/up)")
        } catch (e: Throwable) {
            cachedService = null; cachedMethod = null
            Log.w(TAG, "CAN 전송 실패", e)
            Result(false, "오류: ${e.javaClass.simpleName}: ${e.message}")
        }
    }

    @Suppress("DiscouragedPrivateApi")
    private fun getService(ctx: Context): Any? {
        cachedService?.let { return it }
        val svc = ctx.getSystemService("can")
        cachedService = svc
        return svc
    }

    private fun getMethod(can: Any): java.lang.reflect.Method {
        cachedMethod?.let { return it }
        val p = Int::class.javaPrimitiveType
        val m = can.javaClass.getMethod("requestCarCommand4", p, p, p, p)
        cachedMethod = m
        return m
    }

    private const val TAG = "CanSender"
}
