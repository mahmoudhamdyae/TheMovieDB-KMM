package com.mahmoudhamdyae.themoviedbkmm.data.util

import com.mahmoudhamdyae.themoviedbkmm.data.remote.MovieRemote
import com.mahmoudhamdyae.themoviedbkmm.domain.model.Movie

internal fun MovieRemote.toMovie(): Movie {
    return Movie(
        id = id,
        title = title,
        description = overview,
        imageUrl = getImageUrl(posterImage),
        releaseDate = releaseDate
    )
}

private fun getImageUrl(posterImage: String) = "https://image.tmdb.org/t/p/w500/$posterImage"