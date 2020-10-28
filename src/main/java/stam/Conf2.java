package stam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import stam.conf.Conf1;

/**
 * @author Evgeny Borisov
 */
@Configuration

@ComponentScan(lazyInit = true, basePackages = "stam.services")
@ComponentScan(lazyInit = true, basePackages = "com.naya.check")
@ComponentScan(basePackages = "stam.conf")
public class Conf2 {
  /*  @Bean
    public Conf1 conf1(){
        return new Conf1();
    }*/
}
