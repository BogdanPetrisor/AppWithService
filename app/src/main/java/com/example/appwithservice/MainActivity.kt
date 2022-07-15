package com.example.appwithservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, MyService::class.java)
        val textView: TextView = findViewById(R.id.textView)
        val dataSent: EditText = findViewById(R.id.dataText)

        val sendButton = findViewById<Button?>(R.id.send_button).apply {
            setOnClickListener {
                intent.putExtra("EXTRA_DATA", dataSent.text.toString())
                startService(intent)
            }

        }

        val stopButton = findViewById<Button?>(R.id.stop_button).apply {
            setOnClickListener {
                stopService(intent)
                Log.d("MyService", "Service stopped")
                textView.text = "Service stopped"
            }
        }

        val startButton = findViewById<Button?>(R.id.start_button).apply {
            setOnClickListener {
                startService(intent)
                textView.text = "Service is running"
            }
        }
    }
}
