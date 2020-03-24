package com.example.coroutineexample

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Product (
    @SerializedName("userId")
    @Expose
    val  userId : Integer,
    @SerializedName("id")
    @Expose
    val  id : Integer,
    @SerializedName("title")
    @Expose
    val  title: String,
    @SerializedName("body")
    @Expose
    val  body : String
)

