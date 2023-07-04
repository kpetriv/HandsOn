package com.example.network

import com.example.network.client.KtorHttpClientFactory
import com.example.network.repository.UserRepository
import com.example.network.repository.UserRepositoryImpl
import com.example.network.service.UserService
import com.example.network.service.UserServiceImpl
import org.koin.dsl.module

val networkModule = module {
    single { KtorHttpClientFactory().getHttpClient() }
    single<UserService> { UserServiceImpl(get()) }
    single<UserRepository> { UserRepositoryImpl(service = get()) }
}