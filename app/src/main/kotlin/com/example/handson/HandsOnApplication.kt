package com.example.handson

import android.app.Application
import android.content.res.Configuration

class HandsOnApplication : Application() {

    // custom DI is initialized here

    override fun onCreate() {
        super.onCreate()
        // Insert init block here for application setup
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        // Do stuff on configuration change here
    }

}