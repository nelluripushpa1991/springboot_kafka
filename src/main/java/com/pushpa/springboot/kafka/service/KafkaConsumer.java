package com.pushpa.springboot.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "pushpa_topic", groupId = "pushpa_group")
    public void listenToTopic(String receivedMsg) {
        System.out.println("Received Msg : " +receivedMsg);
    }

}
