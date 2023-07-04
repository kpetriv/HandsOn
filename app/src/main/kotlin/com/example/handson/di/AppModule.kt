package com.example.handson.di

import com.example.network.networkModule
import org.koin.dsl.module


val appModule = module {
    includes(networkModule)
}