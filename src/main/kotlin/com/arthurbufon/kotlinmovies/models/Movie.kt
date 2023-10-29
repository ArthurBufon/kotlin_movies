package com.arthurbufon.kotlinmovies.models

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.time.LocalDate
@Document(collection = "movies")
data class Movie(
        @Id
        val id: ObjectId = ObjectId(),
        val title: String?,
        val releaseDate: LocalDate,
        val genre: String,
        val rating: Double,
        @Field("movie_id")
        val movieId: Long
)
