package com.mahmoudhamdyae.themoviedbkmm.util

import com.mahmoudhamdyae.themoviedbkmm.di.getSharedModules
import org.koin.core.context.startKoin

fun initKoin(){
    startKoin {
        modules(getSharedModules())
    }
}