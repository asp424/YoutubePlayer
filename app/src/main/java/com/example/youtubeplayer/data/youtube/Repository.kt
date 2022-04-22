package com.example.youtubeplayer.data.youtube

import com.example.youtubeplayer.core.FJ
import com.example.youtubeplayer.data.youtube.retrofit.Handler
import com.example.youtubeplayer.data.youtube.retrofit.RetrofitProvider
import javax.inject.Inject

interface Repository {

    fun subscriptions(): FJ

    class Base @Inject constructor(
        private val handler: Handler,
        private val rP: RetrofitProvider
    ) : Repository {
        override fun subscriptions() = handler.task(rP.youtubeDataApi.getYouTubeVideos())
    }
}