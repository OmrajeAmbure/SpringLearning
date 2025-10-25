package org.example;

import org.example.target.Flipkart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Flipkart fkart = (Flipkart) context.getBean("fkart");
        fkart.placeOrder();
        fkart.shippedOrder();
        fkart.returnOrder();
    }
}