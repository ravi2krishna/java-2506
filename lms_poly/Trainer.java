package lms_poly;

import java.util.Scanner;

public class Trainer extends AbstractPerson implements Personable, Payables {
   
    private String trainerDepartment;
   private int basePayPerSession;
   private int totalSessionsTaken;
   private int paymentForSessions;
   private int trainingBonus;
   private int totalPayment;


   // Getters and Setters
   public String getTrainerDepartment() {
       return trainerDepartment;
   }

   public void setTrainerDepartment(String trainerDepartment) {
       this.trainerDepartment = trainerDepartment;
   }

   public int getBasePayPerSession() {
       return basePayPerSession;
   }

   public void setBasePayPerSession(int basePayPerSession) {
       this.basePayPerSession = basePayPerSession;
   }

   public int getTotalSessionsTaken() {
       return totalSessionsTaken;
   }

   public void setTotalSessionsTaken(int totalSessionsTaken) {
       this.totalSessionsTaken = totalSessionsTaken;
   }

   // implmenting Personable abstract method
   public void setPersonDetails() {
    Scanner sc = new Scanner(System.in);
       System.out.println("=======Enter Trainer Details=======");
       System.out.println("Enter ID:");
       setPersonID(sc.nextInt());
       System.out.println("Enter Name:");
       sc.nextLine(); // Clear the buffer
       setPersonName(sc.nextLine());
       System.out.println("Enter Age:");
       setPersonAge(sc.nextInt());
       System.out.println("Enter Mobile Number:");
       setPersonMobileNumber(sc.nextInt());
       System.out.println("Enter Description:");
       setPersonDescription(getPersonDescription());
       System.out.println("Enter Your Base Pay:");
       basePayPerSession = sc.nextInt();
   }

   // implmenting Personable abstract method
   public void displayPersonDetails(){ 
    System.out.println("======= Trainer Information =======");
       System.out.println("ID: " + getPersonID());
       System.out.println("Name: " + getPersonName());
       System.out.println("Age: " + getPersonAge());
       System.out.println("Mobile: " + getPersonMobileNumber());
       System.out.println("Description: " + getPersonDescription());
   }

   // implmenting Payables abstract method
   public void calaculatePayment() {
    Scanner sc = new Scanner(System.in);
       System.out.println("Enter Total Sessions Taken: ");
       totalSessionsTaken = sc.nextInt();
       // paymentForSessions = 1500*totalSessionsTaken;
       paymentForSessions = basePayPerSession * totalSessionsTaken;
       Student s1 = new Student();
       System.out.println();
       System.out.println("=======Student Rating=======");
       trainingBonus = s1.trainerRatings();
       totalPayment = paymentForSessions + trainingBonus;
       System.out.println("=======Trainer Payment=======");
       System.out.println("Total Trainer Payment: " + totalPayment);
   }

}
