package com.example.coroutineexample

import com.example.coroutineexample.Product
import retrofit2.http.*

interface ClientApi{

    @Get{/posts}
    suspend fun fetchAll(): List<Product>
}

