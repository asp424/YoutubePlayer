package com.example.youtubeplayer.di

import android.app.Dialog
import com.example.youtubeplayer.di.modules.PlayerInitializerModule
import com.example.youtubeplayer.di.modules.RepositoryModule
import com.example.youtubeplayer.di.modules.ResourcesProviderModule
import com.example.youtubeplayer.youtubeplayerlisteners.PlayerInitialize
import dagger.BindsInstance
import dagger.Component


@Component(
    modules = [
        PlayerInitializerModule::class,
        ResourcesProviderModule::class,
        RepositoryModule::class]
)
interface AppComponent {
    @Component.Builder
    interface Builder {

        @BindsInstance
        fun errorDialog(dialog: Dialog): Builder

        fun create(): AppComponent
    }

    fun playerInit(): PlayerInitialize
}