package com.example.youtubeplayer.core

import android.app.Application
import com.example.youtubeplayer.di.AppComponent
import com.example.youtubeplayer.di.DaggerAppComponent

class App : Application() {
    val appComponent: AppComponent.Builder by lazy { DaggerAppComponent.builder() }
}

