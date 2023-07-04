package com.example.network.repository

import android.util.Log
import androidx.paging.PagingData
import com.example.network.dto.User
import com.example.network.service.UserService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class UserRepositoryImpl(
    private val service: UserService,
) : UserRepository {
    override fun getUsers(pageSize: Int): Flow<PagingData<User>> = flow {
        service.getUsers(page = 1, results = 20)
        // TODO
        Log.d("TEST", "calling getUsers in repo")
    }
}