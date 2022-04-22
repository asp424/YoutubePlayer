package com.example.youtubeplayer.data.youtube.api

import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface YoutubeDataApi {
    @GET("{data}")
    fun fetchData(@Path("data") data: String?): Call<JsonObject>
}