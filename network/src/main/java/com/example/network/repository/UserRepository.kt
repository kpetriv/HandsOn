package com.example.network.repository

import androidx.paging.PagingData
import com.example.network.dto.User
import kotlinx.coroutines.flow.Flow

interface UserRepository {
    fun getUsers(pageSize: Int): Flow<PagingData<User>>
}