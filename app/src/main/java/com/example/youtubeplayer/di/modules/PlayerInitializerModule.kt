package com.example.youtubeplayer.di.modules

import android.app.Dialog
import com.example.youtubeplayer.ui.youtube_player_listeners.PlayerInitialize
import dagger.Module
import dagger.Provides

@Module
class PlayerInitializerModule {

    @Provides
    fun provideInit(errorDialog: Dialog) = PlayerInitialize(errorDialog)
}