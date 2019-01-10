package com.naya.strategy_command;

import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class WhatsAppSender implements MessageSender {
    @Override
    public String send(Message message) {
        String status = "WhatsApp msg was sent";
        System.out.println(status);
        return status;
    }
}
