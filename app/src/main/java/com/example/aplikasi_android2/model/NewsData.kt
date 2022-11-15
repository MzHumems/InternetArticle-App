package com.example.aplikasi_android2.model

data class NewsData (
    val articles: List<Article>,
    val status: String,
    val totalResult: Int
)