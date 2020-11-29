package com.ma;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        Order order = new Order("1", "John", "john@email.com", "050 123 45 67");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");

        OrderProcessor orderProcessor = (OrderProcessor) context.getBean("OrderProcessor");

        orderProcessor.process(order);
    }

}
