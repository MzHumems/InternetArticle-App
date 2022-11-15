package com.example.aplikasi_android2.network

import com.example.aplikasi_android2.model.NewsData
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private val BASE_URL = "https://newsapi.org/"
private val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface newsAPIservice {
    @GET("top-headlines?country=us&apiKey=0b96a3af806b4d6196297d08550892ac")
    suspend fun getTopHeadline(): NewsData

    //untuk define API yang lain
}

object API{
    val newsAPIservice: newsAPIservice by lazy {
        retrofit.create(newsAPIservice::class.java)
    }
}


