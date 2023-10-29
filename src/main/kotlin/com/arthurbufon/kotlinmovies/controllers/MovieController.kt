package com.arthurbufon.kotlinmovies.controllers

import com.arthurbufon.kotlinmovies.models.Movie
import com.arthurbufon.kotlinmovies.repositories.MovieRepository
import com.arthurbufon.kotlinmovies.services.MovieService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
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
    fun findByMovieId(@PathVariable("id") id: Long): ResponseEntity<Movie> {
        val movie = service.findById(id)
        return if (movie != null) ResponseEntity.ok(movie) else ResponseEntity.notFound().build()
    }

    @PostMapping
    @Transactional
    fun create(@RequestBody movie: Movie): Movie {
        return service.create(movie);
    }

    @PutMapping("/{id}")
    @Transactional
    fun update(@PathVariable("id") id: Long, @RequestBody movie: Movie): Movie? {
        return service.update(id, movie);
    }

    @DeleteMapping("/{id}")
    fun destroy(@PathVariable("id") id: Long) {
        return service.delete(id);
    }
}