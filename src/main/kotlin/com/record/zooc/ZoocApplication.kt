package com.record.zooc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ZoocApplication

fun main(args: Array<String>) {
    runApplication<ZoocApplication>(*args)
}
