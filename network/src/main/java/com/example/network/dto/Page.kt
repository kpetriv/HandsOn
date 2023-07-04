package com.example.network.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Page<T>(
    @SerialName("results") val results: List<T>,
    @SerialName("info") val info: Info,
) {
    @Serializable
    data class Info(
        @SerialName("seed") val seed: String,
        @SerialName("results") val results: Int,
        @SerialName("page") val page: Int,
        @SerialName("version") val version: String,
    )
}