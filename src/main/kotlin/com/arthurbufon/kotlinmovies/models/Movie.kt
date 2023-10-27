package com.arthurbufon.kotlinmovies.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate
@Document(collection = "movies")
data class Movie(
        @Id val id: Long,
        val title: String?,
        val releaseDate: LocalDate,
        val genre: String,
        val rating: Double
)
