package com.example.superapp

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp
import logging.AppLogger

@HiltAndroidApp
class SuperApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        AppLogger.d(message = "Application is launched")
    }
    companion object{
        const val TAG = "SuperApplication"
    }
}