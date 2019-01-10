package com.naya.strategy_command;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Evgeny Borisov
 */
@Service
public class DatabaseSender implements MessageSender {
    @Override
    @Transactional
    public String send(Message message) {
        String status = "Viber msg was sent";
        System.out.println(status);
        return status;
    }
}
