package org.demo

import org.demo.kafka.Consumer
import org.demo.kafka.Producer
import java.util.*

fun main() {

    println("1. Start Consumer\n2. Start Producer")
    print("Choice ?: 1 or 2 -> ")
    when(Scanner(System.`in`).nextInt()) {
        1 -> {
            Consumer().startConsumer()
        }
        2 -> {
            Producer().startProducer()
        }
    }

}