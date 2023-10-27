package com.arthurbufon.kotlinmovies.controllers

import com.arthurbufon.kotlinmovies.models.Movie
import com.arthurbufon.kotlinmovies.repositories.MovieRepository
import com.arthurbufon.kotlinmovies.services.MovieService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.transaction.annotation.Transactional
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@Validated
@RequestMapping("/movies")
class MovieController(val service: MovieService) {

    @GetMapping
    fun getAll(): List<Movie> {
        return service.findAll();
    }

    @GetMapping("/{id}")
    fun getById(id: String): Optional<Movie> {
        return service.findById(id);
    }

    @PostMapping
    @Transactional
    fun create(@RequestBody movie: Movie): Movie {
        return service.create(movie);
    }
}