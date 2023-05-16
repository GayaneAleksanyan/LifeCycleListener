package com.example.lifecyclelistener

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MainActivityObserver : LifecycleObserver {
    private val TAG = javaClass.simpleName

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun start() {
        Log.i(TAG, "!!!I\'m inside Observer of MainActivity ON_CREATE")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun stop() {
        Log.i(TAG, "!!!I\'m inside Observer of MainActivity ON_STOP")
    }
}