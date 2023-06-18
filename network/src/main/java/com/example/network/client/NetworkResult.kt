package com.example.network.client

sealed class NetworkResult<out T> {
    class Success<T>(val value: T) : NetworkResult<T>()
    class Failure(val e: Exception) : NetworkResult<Nothing>()
}
