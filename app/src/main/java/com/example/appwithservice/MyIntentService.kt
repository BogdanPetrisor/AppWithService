package com.example.appwithservice

import android.app.IntentService
import android.content.Intent
import android.util.Log


class MyIntentService : IntentService("MyIntentService") {

    companion object {
        private lateinit var instance: MyIntentService
        var isRunning = false
    }

    fun stopService(){
        Log.d("MyIntentService","Service is stopping...")
        isRunning = false
        instance.stopSelf()
    }

    override fun onHandleIntent(p0: Intent?) {
        isRunning = true
        try {
            while (isRunning){
                Log.d("MyIntentService","Service is running")
                Thread.sleep(1000)
            }
        }catch (e: InterruptedException){
            Thread.currentThread().interrupt()
        }
    }
}