package lms_poly;

import java.util.Random;

public abstract class AbstractPayment implements Payment {

    private String transcationId;

    public abstract void processPayment(double amount); 

    // generate Transcation Id after processing the payment
    public String gettranscationId(){
        Random randomID = new Random();
        transcationId = "TX-ID-"+randomID.nextInt(100000000);
        return transcationId;
    }

    // Receipt Generation
    public void generateReceipt(String transcationId) {
        System.out.println("Receipt Generated For Transcation ID: "+transcationId);
    }

}
