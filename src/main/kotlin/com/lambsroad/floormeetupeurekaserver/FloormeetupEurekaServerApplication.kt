package com.lambsroad.floormeetupeurekaserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class FloormeetupEurekaServerApplication

fun main(args: Array<String>) {
    runApplication<FloormeetupEurekaServerApplication>(*args)
}
