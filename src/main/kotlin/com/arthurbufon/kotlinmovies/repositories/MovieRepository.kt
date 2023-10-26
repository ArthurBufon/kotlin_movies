package com.arthurbufon.kotlinmovies.repositories

import com.arthurbufon.kotlinmovies.models.Movie
import org.springframework.data.mongodb.repository.MongoRepository

interface MovieRepository : MongoRepository<Movie, String> {
    //
}