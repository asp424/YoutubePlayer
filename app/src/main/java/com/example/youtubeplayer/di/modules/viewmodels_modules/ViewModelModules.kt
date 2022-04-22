package com.example.youtubeplayer.di.modules.viewmodels_modules

import androidx.lifecycle.ViewModel
import com.example.youtubeplayer.viewmodels.YoutubeViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@Module
interface ViewModelModules {
    @IntoMap
    @Binds
    @ViewModelKey(YoutubeViewModel::class)
    fun bindsBotViewModel(viewModel: YoutubeViewModel): ViewModel
}
