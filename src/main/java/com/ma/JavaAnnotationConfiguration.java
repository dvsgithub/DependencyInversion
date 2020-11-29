package com.ma;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaAnnotationConfiguration {
    @Bean
    public GreetingService greetingService() {
        return new GreetingServiceImpl();
    }
}
