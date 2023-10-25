package com.arthurbufon.kotlinmovies

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinMoviesApplication

fun main(args: Array<String>) {
	runApplication<KotlinMoviesApplication>(*args)
}
