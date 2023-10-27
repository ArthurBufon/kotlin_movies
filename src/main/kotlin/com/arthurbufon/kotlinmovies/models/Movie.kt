package com.arthurbufon.kotlinmovies.models

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.time.LocalDate
@Document("movies")
data class Movie(
        @Id
        val id: ObjectId = ObjectId(),
        val title: String,
        @Field("release_date")
        val releaseDate: LocalDate,
        val genre: String,
        val rating: Double
)
