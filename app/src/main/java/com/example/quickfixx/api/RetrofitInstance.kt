package com.example.quickfixx.api

import com.example.quickfixx.util.constants.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: TestApi by lazy{
        retrofit.create(TestApi::class.java)
    }
}