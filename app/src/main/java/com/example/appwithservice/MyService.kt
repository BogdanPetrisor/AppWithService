package com.example.appwithservice

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class MyService : Service() {

    val TAG = "MyService"
    init{
        Log.d(TAG,"Service is running...")
    }

    override fun onBind(p0: Intent?): IBinder? = null
}