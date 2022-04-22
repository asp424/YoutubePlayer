package com.example.youtubeplayer.di.modules

import com.example.youtubeplayer.data.youtube.retrofit.Handler
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface HandlerModule {

    @Binds
    @Singleton
    fun bindsHandlerModule(handler: Handler.Base): Handler

}