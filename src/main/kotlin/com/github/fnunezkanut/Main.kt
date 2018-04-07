package com.github.fnunezkanut

import io.vertx.core.Launcher
import io.vertx.core.logging.LoggerFactory
import io.vertx.core.logging.SLF4JLogDelegateFactory
import io.vertx.core.logging.LoggerFactory.LOGGER_DELEGATE_FACTORY_CLASS_NAME
import java.lang.System.setProperty


fun main(args: Array<String>) {

    setProperty(LOGGER_DELEGATE_FACTORY_CLASS_NAME, SLF4JLogDelegateFactory::class.java.name)
    LoggerFactory.getLogger(LoggerFactory::class.java) // Required for Logback to work in Vertx
    Launcher.executeCommand("run", HelloVerticle::class.java.name)
}