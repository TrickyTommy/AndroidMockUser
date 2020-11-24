package com.example.androidmockuser.service

import com.example.androidmockuser.respons.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface UserServices {
    @GET("api")
    fun getAllUser(
        @Query("results")
        results: Int = 100,
        @Query("page") page: Int = 1
    ): Call<UserResponse>
}