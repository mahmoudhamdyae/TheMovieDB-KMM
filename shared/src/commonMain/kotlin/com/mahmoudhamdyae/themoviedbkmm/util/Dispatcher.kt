package com.mahmoudhamdyae.themoviedbkmm.util

import kotlinx.coroutines.CoroutineDispatcher

internal interface Dispatcher {
    val io: CoroutineDispatcher
}

internal expect fun provideDispatcher(): Dispatcher