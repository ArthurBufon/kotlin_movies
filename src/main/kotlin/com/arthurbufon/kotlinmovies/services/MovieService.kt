package com.arthurbufon.kotlinmovies.services

import com.arthurbufon.kotlinmovies.models.Movie
import com.arthurbufon.kotlinmovies.repositories.MovieRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MovieService(@Autowired private val repository: MovieRepository) {
    fun findAll(): List<Movie> {
        return repository.findAll();
    }
}