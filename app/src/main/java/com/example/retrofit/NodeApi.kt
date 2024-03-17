package com.example.retrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

interface NodeApi {
    companion object {
        val instance = Retrofit.Builder().baseUrl("http://10.0.2.2:1234/")
            .addConverterFactory(MoshiConverterFactory.create()).client(
                OkHttpClient.Builder().build()
            ).build().create(NodeApi::class.java)
    }
    @GET("movies")
    suspend fun getMovies(): List<NodeItem>
}