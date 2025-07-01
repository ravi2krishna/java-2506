package lms_poly;

import java.util.Scanner;

public class NetBankingPayment extends AbstractPayment {

    private String bankName;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bank Name");
        bankName = sc.next();
        bankName += sc.nextLine();
        this.bankName = bankName;
    }

    public void processPayment(double amount) {
        System.out.println("Processing NetBanking Payment of Rupees: "+amount);
    }

}
