package com.vrk.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class SimpleListener {

    @KafkaListener(topics = "topic-kafka-demo",groupId = "demo-consumer1")
    public void consumeMessage(String message){
        System.out.println("Message received is " + message);

    }
}
