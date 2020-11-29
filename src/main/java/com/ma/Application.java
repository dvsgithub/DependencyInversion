package com.ma;

public class Application {

    public static void main(String[] args) {

        Order order = new Order("1", "John", "john@email.com", "050 123 45 67");

        OrderRepository orderRepository = new MySQLOrderRepository();
        ConfirmationSender mailSender = new ConfirmationEmailSender();

        OrderProcessor orderProcessor =  new OrderProcessor(orderRepository, mailSender);
        orderProcessor.process(order);
    }

}
