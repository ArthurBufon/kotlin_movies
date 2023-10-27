package com.arthurbufon.kotlinmovies.controllers

import com.arthurbufon.kotlinmovies.models.Movie
import com.arthurbufon.kotlinmovies.repositories.MovieRepository
import com.arthurbufon.kotlinmovies.services.MovieService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/movies")
class MovieController(val service: MovieService) {

    @GetMapping
    fun getAll(): List<Movie> {
        return service.findAll();
    }

//    @PostMapping
//    fun create(): Movie {
//        val restaurant = Restaurant().copy(name = "sample", restaurantId = "33332")
//        return repo.insert(restaurant)
//    }
}