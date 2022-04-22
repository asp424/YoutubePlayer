package com.example.youtubeplayer.di.modules

import android.content.res.Resources
import com.example.youtubeplayer.YoutubeActivity
import dagger.Module
import dagger.Provides


@Module
class ResourcesProviderModule {

    @Provides
    fun provideResources(activity: YoutubeActivity): Resources = activity.resources

}