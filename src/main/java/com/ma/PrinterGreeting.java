package com.ma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrinterGreeting implements Printer {

    @Autowired
    private GreetingService greetingService;

    @Override
    public void printMessage() {
        System.out.println("Print on console: "+ greetingService.sayGreeting());
    }
}
