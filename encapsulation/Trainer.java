package encapsulation;

import java.util.Scanner;

public class Trainer extends Person {

    // Static Varaiables --> encapsulation
    private static String trainerDepartment = "Full Stack"; 
    private static int basePayPerSession = 1500;

    // Non-Static Varaiables --> encapsulation
    private int totalSessionsTaken;
    private int paymentForSessions;
    private int trainingBonus;
    private int totalPayment;
   
    
    // generate setters & getters
    public int getTotalSessionsTaken() {
    return totalSessionsTaken;
    }

    public void setTotalSessionsTaken(int totalSessionsTaken) {
        this.totalSessionsTaken = totalSessionsTaken;
    }

    public int getPaymentForSessions() {
        return paymentForSessions;
    }

    public void setPaymentForSessions(int paymentForSessions) {
        this.paymentForSessions = paymentForSessions;
    }

    public int getTrainingBonus() {
        return trainingBonus;
    }

    public void setTrainingBonus(int trainingBonus) {
        this.trainingBonus = trainingBonus;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }


    static void displayTrainerDept() {
        System.out.println("========TRAINING DEPARTMENT========");
        System.out.println("Trainer Department: "+trainerDepartment);
        System.out.println("Trainer Base Pay: "+basePayPerSession);
    }


   // Calculate Trainer Payment
   public void sessionsPayment(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Total Sessions Taken: ");
       totalSessionsTaken = sc.nextInt();
       paymentForSessions = basePayPerSession*totalSessionsTaken;
       Student s1 = new Student();
       System.out.println();
       System.out.println("=======Student Rating=======");
       trainingBonus = s1.trainerRatings();
       totalPayment = paymentForSessions+trainingBonus;
       System.out.println("=======Trainer Payment=======");
       System.out.println("Total Trainer Payment: "+totalPayment);
   }
}

