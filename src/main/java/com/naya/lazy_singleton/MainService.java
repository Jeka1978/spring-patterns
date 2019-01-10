package com.naya.lazy_singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class MainService {


    private final LazySingleton lazySingleton;

    @Lazy
    public MainService(LazySingleton lazySingleton) {
        this.lazySingleton = lazySingleton;
    }


    @EventListener(ContextRefreshedEvent.class)
    public void start(){
        if (planA()) {
            System.out.println("Plan A is working...");
        }else {
            // some code of lazy Service
        }
    }

    private boolean planA() {
        return true;
    }

}
