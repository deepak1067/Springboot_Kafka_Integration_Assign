package com.knoldus.kafka_2.Springbootapp;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "test_topic_kafka",groupId = "group_id")
    public void consumeMessage(String message){

        System.out.println(message);
    }
}