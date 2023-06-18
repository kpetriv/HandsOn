package com.example.network.service

import com.example.network.client.NetworkResult
import com.example.network.dto.Page
import com.example.network.dto.User

interface UserService {
    suspend fun getUsers(
        page: Int,
        results: Int,
    ): NetworkResult<Page<User>>
}