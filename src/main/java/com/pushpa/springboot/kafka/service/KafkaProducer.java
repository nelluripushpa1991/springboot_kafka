package com.pushpa.springboot.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    public void sendMsgToTopic(String msg) {
        kafkaTemplate.send("pushpa_topic", msg);
    }

}
