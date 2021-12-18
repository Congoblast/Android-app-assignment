package com.example.databaseschema.repository

import com.example.databaseschema.api.RetroFitInstance
import com.example.databaseschema.model.Post
import retrofit2.Response

class Repository {
    suspend fun getPost(): Response<List<Post>> {
       return RetroFitInstance.api.getPost()
    }
}