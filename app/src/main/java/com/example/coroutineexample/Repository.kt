package com.example.coroutineexample

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class Repository{

    fun retrofit() :ClientApii{
       return Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ClientApii::class.java)
    }

    suspend fun fetchDetails() : List<Product>{
        return retrofit().fetchDetails()
    }
}