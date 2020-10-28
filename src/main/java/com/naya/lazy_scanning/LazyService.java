package com.naya.lazy_scanning;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Service
public class LazyService {
    @PostConstruct
    public void init() {
        System.out.println("Lazy service was created");
    }
}
