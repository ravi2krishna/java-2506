package encapsulation;

import java.util.Scanner;

public class LMSGradePaymentTracker {
    public static void main(String[] args) {
        // In previous approach we used constructors
        // Student s1 = new Student(101, "Ravi", 990909090, 25, "i have a friend who has given me Reference", 30000);
        
        Student s1 = new Student();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student ID: ");
        s1.setPersonID(sc.nextInt());
        System.out.println("Enter Student Name: ");
        s1.setPersonName(sc.next());
        System.out.println("Enter Student Age: ");
        s1.setPersonAge(sc.nextInt());
        System.out.println("Enter Student Mobile Number: ");
        s1.setPersonMobileNumber(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter Student Description: ");
        s1.setStudentDescription(sc.nextLine());
        System.out.println("Enter Course Fee: ");
        s1.setCourseFee(sc.nextDouble());

        // Welcome Student
        s1.displayInfo();

        // Calculate Course Fee --> Newly implemented
        s1.calculateCourseFee();

        // Student Achievements
       s1.achievementStatus();

       // Set Trainer Identity
       // In previous approach we used constructors
       // Trainer t1 = new Trainer(201,"ravi",30,99999);

       Trainer t1 = new Trainer();
       
       System.out.println("Enter Trainer ID: "); 
       t1.setPersonID(sc.nextInt());

       System.out.println("Enter Trainer Name: "); 
       t1.setPersonName(sc.next());
       
       System.out.println("Enter Trainer Age: "); 
       t1.setPersonAge(sc.nextInt());

       System.out.println("Enter Trainer Mobile Number: "); 
       t1.setPersonMobileNumber(sc.nextInt());

       // Welcome Trainer
       t1.displayInfo();

       // Trainer Payments
       t1.sessionsPayment();

    }
}
