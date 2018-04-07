package com.github.fnunezkanut

import io.vertx.core.AbstractVerticle
import io.vertx.core.logging.LoggerFactory
import io.vertx.kotlin.core.http.HttpServerOptions

class HelloVerticle : AbstractVerticle() {

    companion object {
        private val logger = LoggerFactory.getLogger(HelloVerticle::class.java)
    }

    init {
        logger.info( this::class.java.name + " created")
    }

    override fun start() {

        logger.info( this::class.java.name + " started")

        vertx.createHttpServer(
            HttpServerOptions(
                port = 8081,
                host = "localhost"
            )
        ).requestHandler { req ->

            logger.info( "request received, replying...")
            req.response().end("Hello World + Kotlin + Gradle + Vertx")
        }.listen()
    }
}