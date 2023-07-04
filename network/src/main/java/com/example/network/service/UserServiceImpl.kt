package com.example.network.service

import android.util.Log
import com.example.network.client.BASE_URL
import com.example.network.client.NetworkResult
import com.example.network.dto.Page
import com.example.network.dto.User
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class UserServiceImpl(
    private val client: HttpClient
) : UserService {
    override suspend fun getUsers(
        page: Int,
        results: Int,
    ): NetworkResult<Page<User>> {
        return try {
            Log.d("TEST", "calling getUsers in service")
            NetworkResult.Success(
                client.get(BASE_URL) {
                    url {
                        encodedParameters.append(
                            name = "page",
                            value = page.toString()
                        )
                        encodedParameters.append(
                            name = "results",
                            value = results.toString()
                        )
                        encodedParameters.append(
                            name = "seed",
                            value = "abc"
                        )
                        encodedParameters.append(
                            name = "inc",
                            value = "name,email"
                        )
                    }
                }.body()
            )
        } catch (e: Exception) {
            e.printStackTrace()
            NetworkResult.Failure(e)
        }
    }
}