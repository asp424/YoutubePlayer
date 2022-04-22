package com.example.youtubeplayer.di

import android.app.Application
import android.app.Dialog
import com.example.youtubeplayer.core.YoutubeActivity
import com.example.youtubeplayer.ui.youtube_player_listeners.PlayerInitialize
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
        fun application(application: Application): Builder

        fun create(): AppComponent
    }

    fun playerInit(): PlayerInitialize

    fun inject(activity: YoutubeActivity)
}