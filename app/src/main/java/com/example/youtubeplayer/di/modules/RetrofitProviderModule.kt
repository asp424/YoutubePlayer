package com.example.youtubeplayer.di.modules

import com.example.youtubeplayer.data.youtube.retrofit.RetrofitProvider
import dagger.Binds
import dagger.Module
import javax.inject.Singleton


@Module
interface RetrofitProviderModule {

    @Binds
    @Singleton
    fun bindRetrofitProvider(rP: RetrofitProvider.Base): RetrofitProvider
}