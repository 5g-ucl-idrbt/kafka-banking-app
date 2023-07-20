package com.idrbt.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic idrbtTopic(){
        return TopicBuilder.name("idrbt")
                .build();
    }

    @Bean
    public NewTopic idrbtJsonTopic(){
        return TopicBuilder.name("idrbt_json")
                .build();
    }
}
