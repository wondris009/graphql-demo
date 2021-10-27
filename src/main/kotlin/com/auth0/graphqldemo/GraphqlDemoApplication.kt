package com.auth0.graphqldemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GraphqlDemoApplication

fun main(args: Array<String>) {
    runApplication<GraphqlDemoApplication>(*args)
}
