package com.naya.lazy_singleton;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Service
@Lazy
@Scope("prototype")
public class Blaster {
    private boolean wasUsed = false;
    @PostConstruct
    private void init(){
        System.out.println("you paid 100500 for the blaster");
    }

    public void fire() {
        if (wasUsed) {
            throw new IllegalStateException("blaster was in use already");
        }
        System.out.println("boom boom!!!");
        wasUsed = true;
    }

}
