package com.example.youtubeplayer.core

import android.os.Bundle
import com.example.youtubeplayer.data.youtube.Repository
import com.example.youtubeplayer.log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import javax.inject.Inject

class YoutubeActivity : BaseActivity() {

    @Inject
    lateinit var repository: Repository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(view.apply { initialize(key, playerInit) })
        dagger.inject(this)
        //CoroutineScope(IO).launch { repository.subscriptions().collect{
            //it.log
                // }
        //}
    }
}

