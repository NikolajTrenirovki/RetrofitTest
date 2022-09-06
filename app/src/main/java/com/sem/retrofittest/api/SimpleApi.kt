package com.sem.retrofittest.api

import com.sem.retrofittest.model.Post
import retrofit2.http.GET

interface SimpleApi {

    @GET("todos/1")
    suspend fun getPost() : Post

}