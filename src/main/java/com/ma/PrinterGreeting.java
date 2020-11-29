package com.ma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class PrinterGreeting implements Printer {

    @Autowired
    private GreetingService greetingService;

    private String message;

    @PostConstruct
    public void init() {
        message = greetingService.sayGreeting();
    }

    @Override
    public void printMessage() {
        System.out.println("Print on console: " + message);
    }
}
