package com.naya.strategy_command;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Evgeny Borisov
 */
public interface MessageSender {
    String send(Message message);

    @Autowired
    default void register(MessageDistributor distributor) {
        distributor.register("001", this);
    }
}
