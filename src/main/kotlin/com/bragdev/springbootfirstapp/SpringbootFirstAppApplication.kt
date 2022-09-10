package com.bragdev.springbootfirstapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringbootFirstAppApplication

fun main(args: Array<String>) {
	runApplication<SpringbootFirstAppApplication>(*args)
}
