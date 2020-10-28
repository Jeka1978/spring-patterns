package com.naya.lazy_scanning;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */

public class NecessaryService {
    @PostConstruct
    public void init() {
        System.out.println("NecessaryService was created ");
    }
}
