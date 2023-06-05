package com.mahmoudhamdyae.themoviedbkmm.di

import com.mahmoudhamdyae.themoviedbkmm.data.remote.MovieService
import com.mahmoudhamdyae.themoviedbkmm.data.remote.RemoteDataSource
import com.mahmoudhamdyae.themoviedbkmm.data.repository.MovieRepositoryImpl
import com.mahmoudhamdyae.themoviedbkmm.domain.repository.MovieRepository
import com.mahmoudhamdyae.themoviedbkmm.domain.usecase.GetMovieUseCase
import com.mahmoudhamdyae.themoviedbkmm.domain.usecase.GetMoviesUseCase
import com.mahmoudhamdyae.themoviedbkmm.util.provideDispatcher
import org.koin.dsl.module

private val dataModule = module {
    factory { RemoteDataSource(get(), get()) }
    factory { MovieService() }
}

private val utilityModule = module {
    factory { provideDispatcher() }
}

private val domainModule = module {
    single<MovieRepository> { MovieRepositoryImpl(get()) }
    factory { GetMoviesUseCase() }
    factory { GetMovieUseCase() }
}

private val sharedModules = listOf(domainModule, dataModule, utilityModule)

fun getSharedModules() = sharedModules