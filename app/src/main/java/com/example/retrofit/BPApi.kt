package com.example.retrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Headers

interface BPApi {
    companion object {
        val instance = Retrofit.Builder().baseUrl("http://10.0.2.2:the-port/")
            .addConverterFactory(MoshiConverterFactory.create()).client(
                OkHttpClient.Builder().build()
            ).build().create(BPApi::class.java)
    }
    @Headers("authorization: Bearer ")
    @GET("customers")
    suspend fun getCustomers(): List<CustomerItem>
}