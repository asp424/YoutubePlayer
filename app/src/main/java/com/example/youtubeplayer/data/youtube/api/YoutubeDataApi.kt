package com.example.youtubeplayer.data.youtube.api

import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface YoutubeDataApi {
    @GET("search?key=" + "AIzaSyD_C0tLoN1DgDigXFyo3E2j_p6ZxeVhtCk" + "&channelId=UCgxTPTFbIbCWfTR9I2-5SeQ" + "&part=snippet&type=video&maxResults=50")
    fun getYouTubeVideos(
    ): Call<JsonObject>
}