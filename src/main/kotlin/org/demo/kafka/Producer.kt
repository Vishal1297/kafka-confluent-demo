package org.demo.kafka

import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig
import io.confluent.kafka.serializers.KafkaAvroSerializer
import org.apache.kafka.clients.producer.KafkaProducer
import org.apache.kafka.clients.producer.ProducerConfig
import org.apache.kafka.clients.producer.ProducerRecord
import org.apache.kafka.common.KafkaException
import org.apache.kafka.common.serialization.IntegerSerializer
import org.apache.kafka.common.serialization.StringSerializer
import org.apache.log4j.LogManager
import org.apache.log4j.Logger
import org.demo.*
import org.demo.model.Book
import java.util.*
import kotlin.system.exitProcess


class Producer {

    companion object {
        val logger: Logger = LogManager.getLogger(Producer::class.java)
    }

    fun startProducer() {
        logger.info("Starting Producer...")
        logger.info("topicName=$KAFKA_TOPIC_NAME, numEvents=$EVENTS_SIZE")
        logger.info("Creating Kafka Producer...")
        val props = Properties()
        props[ProducerConfig.CLIENT_ID_CONFIG] = "simpleProducer"
        props[ProducerConfig.BOOTSTRAP_SERVERS_CONFIG] = KAFKA_BROKERS
        props[ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG] = IntegerSerializer::class.java
        props[ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG] = KafkaAvroSerializer::class.java
        props[AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG] = SCHEMA_REGISTRY_URL
        val producer = KafkaProducer<Int?, String?>(props)
        logger.info("Start sending messages...")
        try {
            for (i in 1..EVENTS_SIZE) {
                val bookStr = getRandomBook()
                System.out.printf(
                    "Topic = %s, key = %s, value = %s\n",
                    KAFKA_TOPIC_NAME,
                    i,
                    bookStr
                )
                producer.send(ProducerRecord<Int?, String?>(KAFKA_TOPIC_NAME, i, bookStr))
            }
        } catch (e: KafkaException) {
            logger.error(
                """
                Exception occurred – Check log for more details.
                ${e.message}
                """.trimIndent()
            )
            exitProcess(-1)
        } finally {
            logger.info("Finished Producer – Closing Kafka Producer.")
            producer.flush()
            producer.close()
        }
    }

}