package static_demo;

public class LMSGradePaymentTracker {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Ravi", 990909090, 25, "i have a friend who has given me Reference", 30000);
        
        // Welcome Student
        s1.studentInfo();

        // Full Info  Student
        s1.studentCompleteInfo();

        // Calculate Course Fee --> Newly implemented
        s1.calculateCourseFee();

        // Student Achievements
       s1.achievementStatus();

       // Set Trainer Identity
       Trainer t1 = new Trainer();
       t1.trainerID = 101;
       t1.trainerName = "Ravi";

       // Welcome Trainer
       t1.trainerInfo();

       // Trainer Payments
       t1.sessionsPayment();

    }
}
