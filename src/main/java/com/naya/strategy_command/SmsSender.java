package com.naya.strategy_command;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
//@Service
public class SmsSender implements MessageSender {
    @Value("${stam}")
    private String stam;

    public SmsSender() {
        System.out.println("ASDasas");
    }

    @PostConstruct
    public void init(){
        System.out.println("SMS SENDNER CREATED");
    }
    @Override
    public String send(Message message) {
        String status = "Sms msg was sent";
        System.out.println(status);
        return status;
    }
}
