package com.naya.strategy_command;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static com.naya.strategy_command.DeliveryType.*;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequiredArgsConstructor
public class MessageDistributor {
   /* private final ViberSender viberSender;
    private final SmsSender smsSender;
    private final WhatsAppSender whatsAppSender;
    private final SkypeSender skypeSender;
    private final DatabaseSender databaseSender;
*/
//    @Autowired
    private Map<String,MessageSender> map = new HashMap<>();

    @PostMapping("/send")
    public String distribute(@RequestBody Message message) {
        String type = message.getDistributionType();
        switch (type) {
            case SMS:
                return sendSms(message);
            case WHATS_APP:
                return sendWhatsApp(message);
            case VIBER:
//                return viberSender.send(message);
            default:
                return "distribution code "+type+" not supported";
        }
    }

    private String sendWhatsApp(Message message) {
        return null;
    }

    private String sendSms(Message message) {
        return null;
    }

    public void register(String s, MessageSender messageSender) {
        map.put(s, messageSender);
    }
}
