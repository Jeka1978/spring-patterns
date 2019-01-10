package com.naya.strategy_command;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Evgeny Borisov
 */
public interface DeliveryType {
    String SMS = "001";
    String WHATS_APP = "002";
    String VIBER = "003";
}
