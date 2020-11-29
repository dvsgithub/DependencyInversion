package com.ma;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        Order order = new Order("1", "John", "john@email.com", "050 123 45 67");

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaAnnotationConfiguration.class);

        OrderProcessor orderProcessor = (OrderProcessor) applicationContext.getBean("OrderProcessor");

        orderProcessor.process(order);


        GreetingService greetingService = applicationContext.getBean(GreetingService.class);

        System.out.println(greetingService.sayGreeting());
    }

}
