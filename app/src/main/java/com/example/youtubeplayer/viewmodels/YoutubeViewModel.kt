package com.example.youtubeplayer.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.youtubeplayer.data.youtube.Repository
import com.example.youtubeplayer.log
import kotlinx.coroutines.launch
import javax.inject.Inject

class YoutubeViewModel @Inject constructor(private val repository: Repository) : ViewModel() {
    fun subscriptions() = viewModelScope.launch {
        repository.subscriptions().collect { it.log }
    }
}