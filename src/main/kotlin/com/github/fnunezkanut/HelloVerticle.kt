package com.github.fnunezkanut

import io.vertx.core.AbstractVerticle
import io.vertx.kotlin.core.http.HttpServerOptions


class HelloVerticle : AbstractVerticle() {

    override fun start() {

        vertx.createHttpServer(
            HttpServerOptions(
                port = 8081,
                host = "localhost"
            )
        ).requestHandler { req ->

            req.response().end("Hello World + Kotlin + Gradle + Vertx")
        }.listen()
    }
}