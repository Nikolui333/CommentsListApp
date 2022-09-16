package com.sem.commentslistapp.data.api

import com.sem.commentslistapp.data.models.CommentsModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("comments")
    fun getApi(): Call<CommentsModel>

}