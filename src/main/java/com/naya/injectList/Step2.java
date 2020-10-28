package com.naya.injectList;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class Step2 implements Step {
    @Override
    public void doAction() {
        System.out.println(222);
    }
}
