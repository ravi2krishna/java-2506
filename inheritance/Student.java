package inheritance;

import java.util.Scanner;

public class Student extends Person {

    // Static Varaiables
    static String instituteName = "Digital Edify";
    static String courseName = "Java";
    static double globalDiscuount = 0.10;

    // Non-Static Varaiables
    // int studentID;
    // String studentName;
    // int studentMobileNumber;
    // int studentAge;
    int totalSessionsAttended;
    int attendanceCredits;
    int performanceCredits;
    int finalCredits;
    int trainerRating;
    String studentDescription;
    double courseFee;

    // Array to store subject scores
    int[] subjectScores; // We’ll initialize this dynamically

    // Taking inputs
    Scanner sc = new Scanner(System.in);

    // Static Block For Initilizations & First Functionality To be called
    // Regardless you make a call or not, it will be executed
    static {
        System.out.println("Welcome To "+instituteName);
        System.out.println("Thanks For Enrolling in "+courseName+ " course");
    }

    // Constructor
    // public Student() {
    // }

    public Student(int studentID, String studentName, int studentMobileNumber, int studentAge, String studentDescription, double courseFee) {
    //    this.studentID = studentID;
    //    this.studentName = studentName;
    //    this.studentMobileNumber = studentMobileNumber;
    //    this.studentAge = studentAge;
       super(studentID, studentDescription, studentAge, studentMobileNumber); // inherited from parent Person
       this.studentDescription = studentDescription;
       this.courseFee = courseFee;
    }    

    // public void studentInfo() {
    //    System.out.println("=======Basic Student Information=======");
    //    System.out.println("Student ID: " + studentID);
    //    System.out.println("Student Name: " + studentName);
    // }

    public Student() {
        //TODO Auto-generated constructor stub
    }

    public void displayInfo() { // // inherited from parent Person
        super.displayInfo(); // call parent class display method 
    }

    // Optional Static method
    // Only gets executed when you make a call 
    public static void displayInstitueDetails(){
        System.out.println("Welcome To "+instituteName);
        System.out.println("Thanks For Enrolling in "+courseName+ " course");
        System.out.println("Hurray You Got Discount "+(globalDiscuount*100)+" %");
    }

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

        // Apply Global Discount
        discount += courseFee * globalDiscuount;

        // Calculate final fee after applying discounts
        double finalFee = courseFee - discount;
        System.out.println("Original Course Fee: "+courseFee);
        System.out.println("Discount Applied: "+discount);
        System.out.println("Global Discount Applied: "+(globalDiscuount*100)+" %");
        System.out.println("FInal Fee To Pat: "+finalFee);
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

