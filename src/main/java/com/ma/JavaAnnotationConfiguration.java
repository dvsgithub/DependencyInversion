package com.ma;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan
@ImportResource("classpath:spring-context.xml")
public class JavaAnnotationConfiguration {
    @Bean
    public GreetingService greetingService() {
        return new GreetingServiceImpl();
    }
}
