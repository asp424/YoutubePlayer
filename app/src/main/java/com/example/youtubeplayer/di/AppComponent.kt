package com.example.youtubeplayer.di

import android.app.Dialog
import com.example.youtubeplayer.YoutubeActivity
import com.example.youtubeplayer.data.youtube.Repository
import com.example.youtubeplayer.presentation.viewmodels.ViewModelFactory
import com.example.youtubeplayer.youtubeplayerlisteners.PlayerInitialize
import com.google.android.youtube.player.YouTubeBaseActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MapModule::class])
interface AppComponent {
    @Component.Builder
    interface Builder {

        @BindsInstance
        fun errorDialog(dialog: Dialog): Builder
        @BindsInstance
        fun activity(activity: YouTubeBaseActivity): Builder

        fun create(): AppComponent
    }

    fun playerInit(): PlayerInitialize

    fun inject(activity: YoutubeActivity)
}