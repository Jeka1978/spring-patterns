package com.naya.lazy_scanning;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Service
@RequiredArgsConstructor(onConstructor_={@Lazy})
public class SomeService {

    private final LazyService service;
    @PostConstruct
    public void init() {
        System.out.println("some service was created");
        System.out.println(service.getClass());
    }
}
