package com.example.databaseschema.model

import com.google.gson.annotations.SerializedName


data class Post (
    val myUserId: Int,
    val id: Int,
    @SerializedName("tier")
    var tier:String?,
    @SerializedName("rank")

    var rank:String?,
    val body: String
    )