package com.example.youtubeplayer.di.modules

import android.app.Dialog
import com.example.youtubeplayer.youtubeplayerlisteners.PlayerInitialize
import com.google.android.youtube.player.YouTubeInitializationResult
import dagger.Module
import dagger.Provides

@Module
class PlayerInitializerModule {

    @Provides
    fun provideInit(errorDialog: Dialog) = PlayerInitialize(errorDialog)
}