package com.ma;

public class Application {

    public static void main(String[] args) {

        Order order = new Order("1", "John", "john@email.com", "050 123 45 67");

        OrderProcessor orderProcessor =  new OrderProcessor();
        orderProcessor.process(order);
    }

}
