package com.example.databaseschema.api

import com.example.databaseschema.BuildConfig
import com.example.databaseschema.model.Post
import retrofit2.Response
import retrofit2.http.GET

//API KEY
const val key: String = BuildConfig.API_KEY

interface SimpleApi {
    @GET("CnFs4qmY2SdQ9Qn_A4t0CJz52k6BnPjrz_8KQdNSYh7QOCY"+"?${key}")
    suspend fun getPost(): Response<List<Post>>
}

