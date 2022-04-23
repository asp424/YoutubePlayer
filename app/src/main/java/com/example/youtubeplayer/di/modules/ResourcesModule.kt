package com.example.youtubeplayer.di.modules

import android.app.Application
import android.content.res.Resources
import com.google.android.youtube.player.YouTubeBaseActivity
import dagger.Module
import dagger.Provides


@Module
class ResourcesModule {

    @Provides
    fun provideResources(application: Application): Resources = application.resources

}