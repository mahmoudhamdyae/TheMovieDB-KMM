package com.mahmoudhamdyae.themoviedbkmm.data.repository

import com.mahmoudhamdyae.themoviedbkmm.data.remote.RemoteDataSource
import com.mahmoudhamdyae.themoviedbkmm.data.util.toMovie
import com.mahmoudhamdyae.themoviedbkmm.domain.model.Movie
import com.mahmoudhamdyae.themoviedbkmm.domain.repository.MovieRepository

internal class MovieRepositoryImpl(
    private val remoteDateSource: RemoteDataSource
): MovieRepository {

    override suspend fun getMovies(page: Int): List<Movie> {
        return remoteDateSource.getMovies(page = page).results.map {
            it.toMovie()
        }
    }

    override suspend fun getMovie(movieId: Int): Movie {
        return remoteDateSource.getMovie(movieId = movieId).toMovie()
    }
}