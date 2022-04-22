package com.example.youtubeplayer

import android.os.Bundle
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import com.example.youtubeplayer.core.BaseActivity
import com.example.youtubeplayer.data.youtube.Repository
import com.example.youtubeplayer.presentation.viewmodels.ViewModelFactory
import com.example.youtubeplayer.presentation.viewmodels.YoutubeViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

class YoutubeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(view.apply { initialize(key, playerInit) })
    }
}

