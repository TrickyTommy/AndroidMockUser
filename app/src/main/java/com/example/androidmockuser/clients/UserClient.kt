package com.example.androidmockuser.clients

import com.example.androidmockuser.service.UserServices
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object UserClient {
    const val BASE_URL = "https://randomuser.me/"

    private val gson: Gson = GsonBuilder().setLenient().create()
    private val interceptor: HttpLoggingInterceptor =
        HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    private val client: OkHttpClient = OkHttpClient.Builder().addInterceptor(interceptor).build()

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create(gson))
        .client(client)
        .build()

    val userService: UserServices by lazy {
        retrofit.create(UserServices::class.java)
    }

}