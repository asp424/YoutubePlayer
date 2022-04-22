package com.example.youtubeplayer

import android.content.Context
import android.util.Log
import com.example.youtubeplayer.core.App

val <T> T.log get() = Log.d("My", toString())

val Context.appComponent get() = (applicationContext as App).appComponent