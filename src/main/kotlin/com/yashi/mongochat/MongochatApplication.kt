package com.yashi.mongochat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MongochatApplication

fun main(args: Array<String>) {
	runApplication<MongochatApplication>(*args)
}
