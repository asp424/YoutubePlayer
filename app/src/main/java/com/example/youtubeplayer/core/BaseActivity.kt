package com.example.youtubeplayer.core

import com.example.youtubeplayer.R
import com.example.youtubeplayer.appComponent
import com.example.youtubeplayer.databinding.PlayerBinding
import com.google.android.youtube.player.YouTubeBaseActivity

abstract class BaseActivity : YouTubeBaseActivity() {

    protected val key by lazy { getString(R.string.key) }

    protected val view by lazy { PlayerBinding.inflate(layoutInflater).root }

    protected val dagger by lazy {
        appComponent.errorDialog(YR.SERVICE_MISSING.getErrorDialog(this, 0)).create() }

    protected val playerInit by lazy { dagger.playerInit() }
}