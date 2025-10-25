package org.example.dependant;

public class Delhivery {
        public Delhivery(){
            System.out.println("Delhivery.Delhivery");
        }
        public String shippedOrder(){
            return  "Order is shipped to delhivery";
        }
        public  String returnOrderToDelhivery(){
            return "Order Return Request Accepted";
        }
        public String delhiverOrder(String details){
            return "Order is  Delhiverd";
        }
}
