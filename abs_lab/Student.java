package abs_lab;

import java.util.Scanner;

public class Student extends AbstractPerson implements Personable, Payables {
    // Static Varaiables --> make them encapsulated
    private static String instituteName = "Digital Edify";
    private static String courseName = "Java";
    private static double globalDiscount = 0.10;

    // Non-Static Varaiables --> make them encapsulated
    private int totalSessionsAttended;
    private int attendanceCredits;
    private int performanceCredits;
    private int finalCredits;
    private int trainerRating;
    private String studentDescription;
    private double courseFee;

    // Array to store subject scores
    int[] subjectScores; // We’ll initialize this dynamically

    Scanner sc = new Scanner(System.in);

    // Static Block For Initilizations & First Functionality To be called
    // Regardless you make a call or not, it will be executed
    static {
        System.out.println("Welcome To "+instituteName);
        System.out.println("Thanks For Enrolling in "+courseName+ " course");
    }

    // Getters and Setters
   public double getCourseFee() {
       return courseFee;
   }

   public void setCourseFee(double courseFee) {
       // Validation: Fee must be positive
       if (courseFee > 0) {
           this.courseFee = courseFee;
       } else {
           System.out.println("Invalid course fee value.");
       }
   }

   // implmenting Personable abstract method
   public void setPersonDetails(){
    Scanner sc = new Scanner(System.in);
       System.out.println("=======Enter Student Details=======");
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
       System.out.println("Enter Course Fee:");
       courseFee = sc.nextDouble();
   }

   // implmenting Personable abstract method
   public void displayPersonDetails(){
     System.out.println("======= Student Information =======");
       System.out.println("ID: " + getPersonID());
       System.out.println("Name: " + getPersonName());
       System.out.println("Age: " + getPersonAge());
       System.out.println("Mobile: " + getPersonMobileNumber());
       System.out.println("Description: " + getPersonDescription());
   }

  
   // implmenting Payables abstract method
   public void calaculatePayment() {
    double discount = 0;
       String description = getPersonDescription().toLowerCase();
       // Check for keywords in description
       if (description.contains("reference"))
           discount += 5000;
       if (description.contains("scholarship"))
           discount += 7000;
       if (description.contains("promo"))
           discount += 3000;

       // Apply global discount
       discount += courseFee * globalDiscount;
       double finalFee = courseFee - discount;
       System.out.println("Original Course Fee: $" + courseFee);
       System.out.println("Discount Applied: $" + discount);
       System.out.println("Final Course Fee after Discount: $" + finalFee);
   }

   // Calculate Attendance credits
   public int sessionsCredits() {
       System.out.println("Enter Total Sessions Attended: ");
       totalSessionsAttended = sc.nextInt();
       if (totalSessionsAttended >= 30) {
           return attendanceCredits = attendanceCredits + 5;
       } else if (totalSessionsAttended >= 20) {
           return attendanceCredits = attendanceCredits + 3;
       } else {
           return attendanceCredits = 0;
       }
   }


   // Get Scores for a Dynamic Number of Subjects and Calculate Average
   public int calculateAverageScore() {
       System.out.println("Enter the number of subjects:");
       int numSubjects = sc.nextInt();
      
       // Initialize the array with the specified number of subjects
       subjectScores = new int[numSubjects];
       int sum = 0;

       // Read scores into the array and calculate the sum of all subjects
       for (int i = 0; i < subjectScores.length; i++) {
           System.out.println("Enter score for subject " + (i + 1) + ":");
           subjectScores[i] = sc.nextInt();
           sum += subjectScores[i];
       }

       // Calculate average score
       int averageScore = sum / subjectScores.length;
       return averageScore;
   }


   // Calculate Performance credits based on the average score
   public int scoreCredits(int averageScore) {
       if (averageScore >= 85) {
           return performanceCredits = performanceCredits + 5;
       } else if (averageScore >= 60) {
           return performanceCredits = performanceCredits + 3;
       } else {
           return performanceCredits = 0;
       }
   }

      // Calculate Achievements
   public void achievementStatus() {
       int averageScore = calculateAverageScore(); // Get the average score
       finalCredits = scoreCredits(averageScore) + sessionsCredits();

       if (finalCredits >= 10) {
           System.out.println("**** GOLD ****");
       } else if (finalCredits >= 8) {
           System.out.println("**** SILVER ****");
       } else {
           System.out.println("You Need To IMPROVE");
       }
   }

   // Calculate Trainer Rating
   public int trainerRatings() {
       System.out.println("Enter Trainer Rating: 1-5");
       trainerRating = sc.nextInt();
       if (trainerRating >= 5) {
           // Set bonus as 5000
           return 5000;
       } else {
           // No bonus
           return 0;
       }
   }

}
