package com.ma;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Application {

    public static void main(String[] args) {

        Order order = new Order("1", "John", "john@email.com", "050 123 45 67");

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaAnnotationConfiguration.class);

        OrderProcessor orderProcessor = (OrderProcessor) applicationContext.getBean("OrderProcessor");

        orderProcessor.process(order);


        GreetingService greetingService = applicationContext.getBean(GreetingService.class);

        System.out.println(greetingService.sayGreeting());


        Printer printer = applicationContext.getBean(Printer.class);

        printer.printMessage();


        String jsonUrl = "https://jsonplaceholder.typicode.com/todos/1";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(jsonUrl, String.class);

        System.out.println("Response: " + response.getBody());

    }

}
