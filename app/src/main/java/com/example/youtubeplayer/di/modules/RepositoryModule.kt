package com.example.youtubeplayer.di.modules

import com.example.youtubeplayer.data.youtube.Repository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface RepositoryModule {

    @Binds
    @Singleton
    fun bindRepository(repository: Repository.Base): Repository
}