package com.arthurbufon.kotlinmovies.services

import com.arthurbufon.kotlinmovies.models.Movie
import com.arthurbufon.kotlinmovies.repositories.MovieRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import java.util.*

@Service
class MovieService(@Autowired private val repository: MovieRepository) {
    fun findAll(): List<Movie> {
        return repository.findAll();
    }

    fun create(movie: Movie): Movie {
        return repository.save(movie);
    }

    fun findById(id: Long): Movie? {
        return repository.findByMovieId(id);
    }

    fun update(id: Long, movie: Movie): Movie? {
        return findById(id = id)?.let {
            repository.save(it.copy(
                title = movie.title,
                releaseDate = movie.releaseDate,
                genre = movie.genre,
                rating = movie.rating
            ));
        }
    }

    fun delete(id: Long) {
        var movie = findById(id);
        return repository.delete(movie!!);
    }
}

