package com.example.coroutineexample

import retrofit2.http.GET
import retrofit2.http.Query

interface ClientApii{

    @GET("/posts")
    suspend fun fetchDetails(): List<Product>
}