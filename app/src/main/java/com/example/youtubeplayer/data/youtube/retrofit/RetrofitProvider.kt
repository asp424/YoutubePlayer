package com.example.youtubeplayer.data.youtube.retrofit

import android.content.res.Resources
import android.content.res.loader.ResourcesProvider
import com.example.youtubeplayer.R
import com.example.youtubeplayer.data.youtube.api.YoutubeDataApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

interface RetrofitProvider {

    val youtubeDataApi: YoutubeDataApi

    class Base @Inject constructor(private val resources: Resources) : RetrofitProvider {

        override val youtubeDataApi by lazy {
            Retrofit.Builder()
                .baseUrl(resources.getString(R.string.youtubeUrl))
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(YoutubeDataApi::class.java)
        }
    }
}




