package com.vrk.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SimpleProducer {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;
    public void sendMessage(String message){
        kafkaTemplate.send("topic-kafka-demo",message);
    }
}
