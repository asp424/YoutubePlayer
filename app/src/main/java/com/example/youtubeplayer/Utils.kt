package com.example.youtubeplayer

import android.content.Context
import android.util.Log
import com.example.youtubeplayer.core.App
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

val <T> T.log get() = Log.d("My", toString())

val Context.appComponent get() = (applicationContext as App).appComponent

inline fun main(crossinline work: suspend (() -> Unit)) = MainScope().launch { work() }

inline fun CoroutineScope.io(crossinline work: suspend (() -> Unit)) = launch(IO) { work() }