package org.demo.kafka

import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig
import io.confluent.kafka.serializers.KafkaAvroDeserializer
import io.confluent.kafka.serializers.KafkaAvroDeserializerConfig
import org.apache.kafka.clients.consumer.ConsumerConfig
import org.apache.kafka.clients.consumer.ConsumerRecords
import org.apache.kafka.clients.consumer.KafkaConsumer
import org.apache.kafka.common.serialization.IntegerDeserializer
import org.apache.kafka.common.serialization.StringDeserializer
import org.apache.kafka.common.serialization.StringSerializer
import org.apache.log4j.LogManager
import org.apache.log4j.Logger
import org.demo.*
import org.demo.model.Book
import java.time.Duration
import java.util.*
import kotlin.system.exitProcess


class Consumer {

    companion object {
        val logger: Logger = LogManager.getLogger(Consumer::class.java)
    }

    fun startConsumer() {
        Producer.logger.info("Starting Consumer...")
        Producer.logger.debug("topicName=$KAFKA_TOPIC_NAME, eventsSize=$EVENTS_SIZE")
        Producer.logger.trace("Creating Kafka Consumer...")
        val properties = Properties()
        properties[ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG] = KAFKA_BROKERS
        properties[ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG] = IntegerDeserializer::class.java
        properties[ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG] = KafkaAvroDeserializer::class.java
        properties[ConsumerConfig.GROUP_ID_CONFIG] = KAFKA_GROUP_ID_CONFIG
        properties[ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG] = false
        properties[ConsumerConfig.AUTO_OFFSET_RESET_CONFIG] = "earliest"
        properties[KafkaAvroDeserializerConfig.SPECIFIC_AVRO_READER_CONFIG] = true
        properties[AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG] = SCHEMA_REGISTRY_URL
        val consumer = KafkaConsumer<Int?, String?>(properties)
        consumer.subscribe(Collections.singletonList(KAFKA_TOPIC_NAME))
        try {
            consumer.use { kafkaConsumer ->
                while (true) {
                    val records: ConsumerRecords<Int?, String?> = kafkaConsumer.poll(Duration.ofMillis(100))
                    for (record in records) {
                        System.out.printf(
                            "offset = %d, key = %s, value = %s\n",
                            record.offset(),
                            record.key(),
                            record.value()
                        )
                    }
                }
            }
        } catch (e: Exception) {
            logger.error(
                """
                Exception occurred – Check log for more details.
                ${e.message}
                """.trimIndent()
            )
            Producer.logger.info("Finished Consumer – Closing Kafka Consumer.")
            consumer.close()
            exitProcess(-1)
        } finally {
            consumer.close()
        }
    }

}