package lms_strings;

import java.util.Scanner;

public class Student {
    int studentID;
    String studentName;
    int totalSessionsAttended;
    int attendanceCredits;
    int performanceCredits;
    int finalCredits;
    int trainerRating;
    int studentMobileNumber;
    int studentAge;
    String studentDescription;
    double courseFee;

    // Array to store subject scores
    int[] subjectScores; // We’ll initialize this dynamically

    // Taking inputs
    Scanner sc = new Scanner(System.in);

    // Constructor
    public Student() {
    }

    public Student(int studentID, String studentName, int studentMobileNumber, int studentAge, String studentDescription, double courseFee) {
       this.studentID = studentID;
       this.studentName = studentName;
       this.studentMobileNumber = studentMobileNumber;
       this.studentAge = studentAge;
       this.studentDescription = studentDescription;
       this.courseFee = courseFee;
    }    

    public void studentInfo() {
       System.out.println("=======Basic Student Information=======");
       System.out.println("Student ID: " + studentID);
       System.out.println("Student Name: " + studentName);
    }

    // prompt for coupon code 
    // --> format EDIFY-10 = Add 10% discount
    // --> format EDIFY-25 = Add 20% discount
    // --> format EDIFY-50 = Add 50% discount

    public void calculateCourseFee() {
        double discount = 0;

        String description = studentDescription.toLowerCase();
        
        if (description.contains("reference")) {
            discount += 5000; // based on keyword reference
        }
        if (description.contains("scholarship")) {
            discount += 7000; // based on keyword scholarship
        }
        if (description.contains("promo")) {
            discount += 3000; // based on keyword promo
        }

        // Calculate final fee after applying discounts
        double finalFee = courseFee - discount;
        System.out.println("Original Course Fee: "+courseFee);
        System.out.println("Discount Applied: "+discount);
        System.out.println("FInal Fee To Pat: "+finalFee);
    }

    // Display Complete Student Info
   public void studentCompleteInfo() {
       System.out.println("=======Complete Student Information=======");
       System.out.println("Student ID: " + studentID);
       System.out.println("Student Name: " + studentName);
       System.out.println("Student Mobile: " + studentMobileNumber);
       System.out.println("Student Age: " + studentAge);
       System.out.println("Student Description: " + studentDescription);
       System.out.println("Base Course Fee: $" + courseFee);
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

