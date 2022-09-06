package com.sem.retrofittest.repository

import com.sem.retrofittest.api.RetrofitInterface
import com.sem.retrofittest.model.Post

class Repository {

    suspend fun getPost() : Post {

        return RetrofitInterface.api.getPost()

    }

}