package com.naya.lazy_scanning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@ComponentScan(lazyInit = true, basePackages = "com.naya.check")
public class MockConf {
    @Autowired
    public void initMainConf(ApplicationContext context){
        context.getBean(Conf.class);
    }
}
