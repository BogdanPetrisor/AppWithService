package com.example.appwithservice

import android.app.IntentService
import android.content.Intent



class MyIntentService : IntentService("MyIntentService") {

    companion object {
        private lateinit var instance: MyIntentService
        var isRunning = false
    }

    override fun onHandleIntent(p0: Intent?) {
        TODO("Not yet implemented")
    }
}