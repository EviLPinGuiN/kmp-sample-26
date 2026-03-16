package com.itis.kmpproj26

import android.app.Application
import com.itis.kmpproj26.config.initCommon
import com.itis.kmpproj26.core.CommonKmp
import com.itis.kmpproj26.core.config.Configuration

class AppDelegate : Application() {

    override fun onCreate() {
        super.onCreate()
        initCommon()
    }
}