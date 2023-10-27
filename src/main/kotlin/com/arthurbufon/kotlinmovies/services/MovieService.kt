package com.arthurbufon.kotlinmovies.services

import com.arthurbufon.kotlinmovies.models.Movie
import com.arthurbufon.kotlinmovies.repositories.MovieRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class MovieService(@Autowired private val repository: MovieRepository) {
    fun findAll(): List<Movie> {
        return repository.findAll();
    }

    fun create(movie: Movie): Movie {
        return repository.save(movie);
    }

    fun findById(id: String): Optional<Movie> {
        return repository.findById(id);
    }
}