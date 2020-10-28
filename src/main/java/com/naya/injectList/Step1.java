package com.naya.injectList;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class Step1 implements Step {
    @Override
    public void doAction() {
        System.out.println(1111);
    }
}
