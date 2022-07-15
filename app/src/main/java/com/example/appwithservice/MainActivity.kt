package com.example.appwithservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)

        val stopButton: Button = findViewById<Button?>(R.id.stop_button).apply {
            setOnClickListener {
                MyIntentService.stopService()
                textView.text = "Service stopped"
            }
        }

        val startButton: Button = findViewById<Button?>(R.id.start_button).apply {
            setOnClickListener {
                Intent(this@MainActivity, MyIntentService::class.java).apply {
                    startService(this)
                    textView.text = "Service is running"
                }
            }
        }
    }
}