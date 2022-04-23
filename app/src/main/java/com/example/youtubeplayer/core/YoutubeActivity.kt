package com.example.youtubeplayer.core

import android.os.Bundle
import com.example.youtubeplayer.data.youtube.Repository
import com.example.youtubeplayer.log
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import java.util.concurrent.Future
import javax.inject.Inject

class YoutubeActivity : BaseActivity() {

    @Inject
    lateinit var repository: Repository

    @OptIn(InternalCoroutinesApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(playerView.apply { initialize(BuildConfig.APPLICATION_ID, playerInit) })
        //dagger.inject(this); io {  repository.subscriptions().collect{ it.log } }

        CoroutineScope(Main).launch { start() }
    }

    private suspend fun start() = coroutineScope{
        io { (0 .. 5).forEach { it.log; if (it == 3) return@io } }.join()
        "first".log
    }

    private inline fun Cor.io(crossinline work: doWork) = launch(IO, cS) { work() }

    private val cS by lazy { CoroutineStart.LAZY }

}

typealias Cor = CoroutineScope
typealias doWork = suspend(Cor.() -> Unit)





