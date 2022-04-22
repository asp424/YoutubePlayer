package com.example.youtubeplayer.di.modules.viewmodels_modules

import androidx.lifecycle.ViewModelProvider
import com.example.youtubeplayer.presentation.viewmodels.ViewModelFactory
import dagger.Binds
import dagger.Module
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@Module(includes = [ViewModelModules::class])
interface ViewModelFactoryModule {

    @Binds
    fun bindsViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}