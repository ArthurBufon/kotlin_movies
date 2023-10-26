package com.arthurbufon.kotlinmovies.controllers

import com.arthurbufon.kotlinmovies.repositories.MovieRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/movies")
class MovieController(@Autowired val repository: MovieRepository) {
    @GetMapping
    fun getCount(): Int {
        return repository.findAll().count();
    }
}