package com.example.youtubeplayer.ui.youtube_player_listeners

import android.app.Dialog
import com.example.youtubeplayer.core.YP
import com.example.youtubeplayer.core.YPP
import com.example.youtubeplayer.core.YR
import com.google.android.youtube.player.YouTubePlayer

class PlayerInitialize(private val errorDialog: Dialog):
    YouTubePlayer.OnInitializedListener {

    override fun onInitializationSuccess(provider: YPP, player: YP, wasRestored: Boolean) {
        player.apply {
            setPlayerStateChangeListener(PlayerStateChange)
            setPlaybackEventListener(PlaybackEvent)
            setOnFullscreenListener(PlayerFullscreen)
            loadPlaylist(PLAYLIST)
        }
    }

    override fun onInitializationFailure(provider: YouTubePlayer.Provider?, result: YR) {
        result.apply { if (isUserRecoverableError) errorDialog.show() }
    }

    companion object {
        const val ID = "Ae-6j8W8Vys"
        const val PLAYLIST = "PLeIdlMruOHymIp9uIgd_myXDljpflTK89"
        const val channel = "UCww8QI2ax2jj1a2gnxjV5Sg"
    }
}

