package org.example;

import org.example.SingleTone.ProtoTypeBeanDemo;
import org.example.SingleTone.Singletone;
import org.example.target.Flipkart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Flipkart fkart = (Flipkart) context.getBean("fkart");
//        fkart.placeOrder();
//        fkart.shippedOrder();
//        fkart.returnOrder();

        // SingleTone Demo
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Singletone obj1 = (Singletone) context.getBean("singletonBean");
        System.out.println(obj1);
        Singletone obj2 = context.getBean("singletonBean",Singletone.class);
        System.out.println(obj2);
        if (obj1 == obj2){
            System.out.println("both object are same");
        }else {
            System.out.println("both object are different");
        }
        System.out.println("\n");
        // PrototypeDemo
        ProtoTypeBeanDemo obj3 = context.getBean("prototypeDemo",ProtoTypeBeanDemo.class);
        System.out.println(obj3);
        ProtoTypeBeanDemo obj4 = (ProtoTypeBeanDemo) context.getBean("prototypeDemo");
        System.out.println(obj4);
        if (obj3==obj4){
            System.out.println("Both Are Same Object");
        }else {
            System.out.println("Both Are Different Object");
        }
    }
    /*
            Singletone.Singletone()
            org.example.SingleTone.Singletone@3d34d211
            org.example.SingleTone.Singletone@3d34d211
            both object are same

            ProtoTypeBeanDemo.ProtoTypeBeanDemo
            org.example.SingleTone.ProtoTypeBeanDemo@7dc0f706
            ProtoTypeBeanDemo.ProtoTypeBeanDemo
            org.example.SingleTone.ProtoTypeBeanDemo@4009e306
            Both Are Different Object
     */
}