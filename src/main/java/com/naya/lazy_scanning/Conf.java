package com.naya.lazy_scanning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@SpringBootApplication(scanBasePackages = "com.naya.check")
//@ComponentScan(basePackages = "com.naya.check")
public class Conf {

    @Bean
    public static NecessaryService service(){
        return new NecessaryService();
    }

    @PostConstruct
    public void init() {
        System.out.println("Main configuration started");
    }
    public static void main(String[] args) {
        SpringApplication.run(MConf.class);
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Conf.class);
//        context.getBean(SomeService.class);
    }
}
