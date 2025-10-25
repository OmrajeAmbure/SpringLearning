package org.example.target;

import org.example.dependant.Delhivery;
import org.springframework.beans.factory.annotation.Autowired;


public class Flipkart {
    @Autowired
    private Delhivery  delhivery;
    public Flipkart(){
        System.out.println("Flipkart.Flipkart");
    }

    public void setDelhivery(Delhivery delhivery) {
        this.delhivery = delhivery;
    }

    public void placeOrder(){
            String status = delhivery.shippedOrder();
            System.out.println(status);
    }
    public void  returnOrder(){
            String status = delhivery.returnOrderToDelhivery();
            System.out.println(status);
    }
    public void  shippedOrder(){
            String status = delhivery.shippedOrder();
            System.out.println(status);
    }
}
