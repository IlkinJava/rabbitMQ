package com.example.demo.service;

import com.example.demo.model.TmpData;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

@Service
public class TmpService {

    private final AmqpTemplate amqpTemplate;

    public TmpService(AmqpTemplate amqpTemplate){
        this.amqpTemplate = amqpTemplate;
    }

    public void sendMessage(String data){
        amqpTemplate.convertAndSend("TMP_Q", new TmpData(data));
    }

}
