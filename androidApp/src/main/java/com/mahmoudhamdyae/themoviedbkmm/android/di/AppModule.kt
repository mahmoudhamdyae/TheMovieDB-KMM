package com.mahmoudhamdyae.themoviedbkmm.android.di

import com.mahmoudhamdyae.themoviedbkmm.android.detail.DetailViewModel
import com.mahmoudhamdyae.themoviedbkmm.android.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { params -> DetailViewModel(getMovieUseCase = get(), movieId = params.get()) }
}