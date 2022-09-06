package com.sem.retrofittest.api

import com.sem.retrofittest.util.Constants.Companion.BAS_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitInterface {

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BAS_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: SimpleApi by lazy {
        retrofit.create(SimpleApi::class.java)
    }
}