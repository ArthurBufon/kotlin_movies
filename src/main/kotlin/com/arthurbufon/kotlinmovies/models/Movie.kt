package com.arthurbufon.kotlinmovies.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate
@Document("movies")
data class Movie(
        @Id
        val id:String,
        val title: String,
        val releaseDate: LocalDate,
        val genre: String,
        val rating: Double
)
