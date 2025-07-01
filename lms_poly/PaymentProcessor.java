package lms_poly;

// make different types of payments
public class PaymentProcessor {

    // net banking payment
    public void makePayment(double amount, String bankName) {
        System.out.println("======== NET BANKING PAYMENT ========");
        NetBankingPayment netBanking = new NetBankingPayment();
        System.out.println("Amount To Pay: "+amount);
        netBanking.processPayment(amount);
        netBanking.generateReceipt(netBanking.gettranscationId());
    }

    // credit card payment
    public void makePayment(double amount, int cardNumber) {
        System.out.println("======== CREDIT CARD PAYMENT ========");
        CreditCardPayment creditCard = new CreditCardPayment();
        creditCard.processPayment(amount);
        creditCard.generateReceipt(creditCard.gettranscationId());
    }

    // upi payment
    public void makePayment(double amount, String upiId, String upiPaymentType) {
        System.out.println("======== UPI PAYMENT ========");
        UPIPayment upi = new UPIPayment();
        upi.processPayment(amount);
        upi.generateReceipt(upi.gettranscationId());
    }

}   
