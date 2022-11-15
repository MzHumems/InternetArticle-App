package com.example.aplikasi_android2.ui.theme

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.aplikasi_android2.model.Article
import com.example.aplikasi_android2.network.API
import kotlinx.coroutines.launch

class NewsViewModel : ViewModel() {
    init {
        getListNews()
    }

    fun getListNews(){
        viewModelScope.launch {
            val response = API.newsAPIservice.getTopHeadline()
            val articles = response.articles

            articles.forEach{ article: Article ->
                Log.d("response", article.toString())
            }
        }
    }
}