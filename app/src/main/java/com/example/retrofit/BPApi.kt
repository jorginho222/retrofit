package com.example.retrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Headers

interface BPApi {
    companion object {
        val instance = Retrofit.Builder().baseUrl("http:///")
            .addConverterFactory(MoshiConverterFactory.create()).client(
                OkHttpClient.Builder().build()
            ).build().create(BPApi::class.java)
    }
    @Headers("authorization: Bearer 2d9fa1525500a91dd8cbc4af9f4d3124ca80d2311a2a5278a29f60f5af49c44e5d27cf00efc520bd7d8c7f2f2a3ae2a65297932610d6b89d20407dbc")
    @GET("customers")
    suspend fun getCustomers(): CustomersResponse
}