package com.example;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;

@Configuration
@EnableKafka
public class KafkaConfiguration {

    // Topic creation.
    @Bean
    public NewTopic topic() {
        return new NewTopic("topic4", 1, (short) 1);
    }
}
