package com.naya.injectList;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Service
public class MyService {

    @InjectListOfBeans({Step2.class,Step1.class})
    private List<Step> steps;

    public void processAllSteps() {
        steps.forEach(Step::doAction);
    }
}
