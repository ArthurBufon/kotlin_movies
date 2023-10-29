package com.arthurbufon.kotlinmovies.services

import com.arthurbufon.kotlinmovies.models.Movie
import com.arthurbufon.kotlinmovies.repositories.MovieRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.stereotype.Service
import org.springframework.data.domain.Pageable

@Service
class MovieService(@Autowired private val repository: MovieRepository) {
    fun findAll(paginacao: Pageable): Page<Movie> {
        return repository.findAll(paginacao);
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
        val movie = findById(id);
        return repository.delete(movie!!);
    }
}

