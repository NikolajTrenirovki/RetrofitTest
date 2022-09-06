package com.sem.retrofittest.model

data class Post(
    val completed: Boolean,
    val id: Int,
    val title: String,
    val userId: Int
)