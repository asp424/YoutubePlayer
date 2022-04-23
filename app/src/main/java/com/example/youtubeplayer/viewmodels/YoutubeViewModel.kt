package com.example.youtubeplayer.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.youtubeplayer.data.youtube.Repository
import com.example.youtubeplayer.log
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import javax.inject.Inject

class YoutubeViewModel @Inject constructor(
    private val repository: Repository,
    private val coroutineDispatcher: CoroutineDispatcher = IO
) : ViewModel() {

    private inline fun CoroutineScope.ioCoroutine(
        crossinline work: suspend (CoroutineScope.() -> Unit)
    ) = launch(coroutineDispatcher, CoroutineStart.LAZY) { work() }

    fun start(scope: CoroutineScope) = with(scope) {
        ioCoroutine {
            ioCoroutine { delay(1000); "first".log }.start()
            1.log
            ioCoroutine { delay(1000); "second".log }.join()
            2.log
        }
    }
}