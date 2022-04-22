package com.example.youtubeplayer.core

import com.example.youtubeplayer.data.youtube.retrofit.ApiResponse
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.gson.JsonObject
import kotlinx.coroutines.flow.Flow


typealias YPP = YouTubePlayer.Provider
typealias YP = YouTubePlayer
typealias YR = YouTubeInitializationResult
typealias FJ = Flow<ApiResponse<JsonObject>>