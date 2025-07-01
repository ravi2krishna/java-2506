package lms_poly;

import java.util.Scanner;

public class CreditCardPayment extends AbstractPayment {

    private int cardNumber;

    public int getcardNumber() {
        return cardNumber;
    }

    public void setcardNumber(int cardNumber) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Card Number");
        cardNumber += sc.nextInt();
        this.cardNumber = cardNumber;
    }

    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment of Rupess: "+amount);
    }

}
