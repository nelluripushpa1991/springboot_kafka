package com.pushpa.springboot.kafka.controller;

import com.pushpa.springboot.kafka.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api")
public class KafkaMsgController {

    @Autowired
    KafkaProducer kafkaProducer;

    @RequestMapping("/producerMsg")
    public void getMsgFromClient(@RequestParam("message") String msg) {
        kafkaProducer.sendMsgToTopic(msg);

    }
}
