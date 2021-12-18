package com.example.databaseschema.api

import com.example.databaseschema.util.Constants.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetroFitInstance {
    private val retrofit by lazy{
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
val api: SimpleApi by lazy {
    retrofit.create(SimpleApi::class.java)
}
}