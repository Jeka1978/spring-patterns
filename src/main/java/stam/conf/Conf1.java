package stam.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan(basePackages = "com.naya.check")
@ComponentScan(basePackages = "stam.services")

public class Conf1 {
    public Conf1() {
        System.out.println("conf1");
    }
}
