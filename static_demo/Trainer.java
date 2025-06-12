package static_demo;

import java.util.Scanner;

public class Trainer {

   // Static Varaiables
   static String trainerDepartment = "Full Stack"; 
   static int basePayPerSession = 1500;

   // Non-Static Varaiables 
   int trainerID;
   String trainerName;
   int totalSessionsTaken;
   int paymentForSessions;
   int trainingBonus;
   int totalPayment;
   
   
    static void displayTrainerDept() {
        System.out.println("========TRAINING DEPARTMENT========");
        System.out.println("Trainer Department: "+trainerDepartment);
        System.out.println("Trainer Base Pay: "+basePayPerSession);
    }

   public void trainerInfo() {
       displayTrainerDept();
       System.out.println("=======Trainer Information=======");
       System.out.println("Trainer ID: "+trainerID);
       System.out.println("Trainer Name: "+trainerName);
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

