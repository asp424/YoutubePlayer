package com.example.youtubeplayer.di.modules

import android.content.res.Resources
import com.google.android.youtube.player.YouTubeBaseActivity
import dagger.Module
import dagger.Provides


@Module
class ResourcesProviderModule {

    @Provides
    fun provideResources(activity: YouTubeBaseActivity): Resources = activity.resources

}