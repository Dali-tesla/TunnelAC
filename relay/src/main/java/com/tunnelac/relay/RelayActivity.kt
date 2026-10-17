package com.tunnelac.relay

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import kotlinx.coroutines.launch

class RelayActivity : AppCompatActivity() {

    private lateinit var tvStatus: TextView
    private lateinit var tvLog: TextView
    private lateinit var etPin: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relay)

        tvStatus = findViewById(R.id.tv_status)
        tvLog = findViewById(R.id.tv_log)
        etPin = findViewById(R.id.et_pin)
        etPin.setText(RelayService.getOrCreatePin(this))
        findViewById<Button>(R.id.btn_save_pin).setOnClickListener {
            val pin = etPin.text.toString().trim()
            if (RelayService.setPin(this, pin)) {
                Toast.makeText(this, "PIN이 변경되었습니다. 폰 앱에도 같은 PIN을 입력하세요.", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "PIN은 숫자 6자리여야 합니다.", Toast.LENGTH_SHORT).show()
            }
        }

        findViewById<Button>(R.id.btn_start).setOnClickListener {
            ContextCompat.startForegroundService(this, Intent(this, RelayService::class.java))
            Toast.makeText(this, "릴레이 서비스 시작", Toast.LENGTH_SHORT).show()
        }
        findViewById<Button>(R.id.btn_stop).setOnClickListener {
            startService(Intent(this, RelayService::class.java).setAction(RelayService.ACTION_STOP))
            Toast.makeText(this, "릴레이 서비스 정지", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.btn_local_recirc).setOnClickListener { localTest(1, "RECIRC") }
        findViewById<Button>(R.id.btn_local_fresh).setOnClickListener { localTest(2, "FRESH") }
        findViewById<Button>(R.id.btn_local_auto).setOnClickListener { localTest(3, "AUTO") }

        observeState()
    }

    private fun localTest(code: Int, name: String) {
        // 서비스가 실행 중이면 BLE 경로와 같은 로직(내기 유지 모드 포함)으로, 아니면 CAN 직접 전송
        val svc = RelayService.instance
        val r = svc?.runCommand(code, "로컬") ?: CanSender.send(this, code)
        val msg = "로컬 테스트 $name: ${if (r.ok) "성공" else "실패"} (${r.message})"
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }

    private fun observeState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                launch {
                    RelayService.runningState.collect { render() }
                }
                launch {
                    RelayService.clientConnectedState.collect { render() }
                }
                launch {
                    RelayService.statusState.collect { render() }
                }
                launch { RelayService.holdState.collect { render() } }
                launch { RelayService.carInnerLoopState.collect { render() } }
                launch { RelayService.monitorState.collect { render() } }
                launch { RelayService.resendCountState.collect { render() } }
                launch {
                    RelayService.lastLogState.collect { log ->
                        tvLog.text = log
                    }
                }
            }
        }
    }

    private fun render() {
        val running = RelayService.runningState.value
        val connected = RelayService.clientConnectedState.value
        tvStatus.text = buildString {
            append(if (running) "서비스: 실행 중" else "서비스: 정지됨")
            append("\n")
            append(if (connected) "폰 연결: 연결됨 ✓" else "폰 연결: 대기 중")
            append("\n")
            append("BLE: ").append(RelayService.statusState.value)
            append("\n")
            append("내기 유지: ").append(if (RelayService.holdState.value) "ON" else "OFF")
            append("  ·  재전송 ").append(RelayService.resendCountState.value).append("회")
            append("\n")
            append("차량 내기순환: ")
            append(
                when {
                    !RelayService.monitorState.value -> "감시 연결 안 됨"
                    RelayService.carInnerLoopState.value == null -> "수신 대기"
                    RelayService.carInnerLoopState.value == true -> "ON"
                    else -> "OFF"
                }
            )
        }
    }
}
