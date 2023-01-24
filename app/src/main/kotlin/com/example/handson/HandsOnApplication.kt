package com.example.handson

import android.app.Application
import com.example.handson.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class HandsOnApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            // Log Koin into Android logger
            androidLogger()
            // Reference Android context
            androidContext(this@HandsOnApplication)
            // Load modules
            modules(appModule)
        }
    }
}