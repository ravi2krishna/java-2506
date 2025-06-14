package inheritance;

public class LMSGradePaymentTracker {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Ravi", 990909090, 25, "i have a friend who has given me Reference", 30000);
        
        // Welcome Student
        s1.displayInfo();

        // Full Info  Student
        // s1.studentCompleteInfo();

        // Calculate Course Fee --> Newly implemented
        s1.calculateCourseFee();

        // Student Achievements
       s1.achievementStatus();

       // Set Trainer Identity
       Trainer t1 = new Trainer(201,"ravi",30,99999);

       // Welcome Trainer
       t1.displayInfo();

       // Trainer Payments
       t1.sessionsPayment();

    }
}
