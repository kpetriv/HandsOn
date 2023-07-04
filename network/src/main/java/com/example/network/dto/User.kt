package com.example.network.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class User(
    @SerialName("name") val name: Name,
    @SerialName("email") val email: String,
) {
    @Serializable
    data class Name(
        @SerialName("first") val first: String,
        @SerialName("last") val last: String,
    )
}