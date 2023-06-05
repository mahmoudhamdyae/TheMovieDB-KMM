package com.mahmoudhamdyae.themoviedbkmm.domain.repository

import com.mahmoudhamdyae.themoviedbkmm.domain.model.Movie

internal interface MovieRepository {

    suspend fun getMovies(page: Int): List<Movie>
    suspend fun getMovie(movieId: Int): Movie
}