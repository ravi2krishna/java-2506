package lms_strings;

import java.util.Scanner;

public class Trainer {
   int trainerID;
   String trainerName;
   int totalSessionsTaken;
   int paymentForSessions;
   int trainingBonus;
   int totalPayment;

   public void trainerInfo() {
       System.out.println("=======Trainer Information=======");
       System.out.println("Trainer ID: "+trainerID);
       System.out.println("Trainer Name: "+trainerName);
   }


   // Calculate Trainer Payment
   public void sessionsPayment(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Total Sessions Taken: ");
       totalSessionsTaken = sc.nextInt();
       paymentForSessions = 1500*totalSessionsTaken;
       Student s1 = new Student();
       System.out.println();
       System.out.println("=======Student Rating=======");
       trainingBonus = s1.trainerRatings();
       totalPayment = paymentForSessions+trainingBonus;
       System.out.println("=======Trainer Payment=======");
       System.out.println("Total Trainer Payment: "+totalPayment);
   }
}

