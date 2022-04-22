package com.example.youtubeplayer

import android.os.Bundle
import com.example.youtubeplayer.core.BaseActivity

class YoutubeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(view.apply { initialize(key, playerInit) })
    }
}

