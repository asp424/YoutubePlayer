package com.example.youtubeplayer.di

import com.example.youtubeplayer.di.modules.*
import dagger.Module
import kotlinx.coroutines.ExperimentalCoroutinesApi

@OptIn(ExperimentalCoroutinesApi::class)
@Module(
    includes = [
        PlayerInitializerModule::class,
        ResourcesProviderModule::class,
        RepositoryModule::class,
        HandlerModule::class,
        RetrofitProviderModule::class
    ]
)
interface MapModule





