package strings_demo;

import java.util.Scanner;

public class Test {

public static void main(String[] args) {
        String username = "ravikrishna";
        // 1st length () method
        // System.out.println(username.length());
        if (username.length()>=6) {
            System.out.println("Valid User Name");
            System.out.println("Welcome: "+username);
        }   else {
            System.out.println("InValid User Name, give atleast 6 letters");
        }

       // check based on character
        // 2nd charAt()
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Gender: ");
        String gender = sc.nextLine();
        if (gender.charAt(0) == 'F' || gender.charAt(0) == 'M' || gender.charAt(0) == 'f' || gender.charAt(0) == 'm' ) {
            System.out.println("Valid");
        } else {
            System.out.println("InValid");
        }
        
        // check based on lowercase
        // 3rd toLowerCase()
        System.out.println("Enter Your Username: ");
        String unformatted_userName = sc.nextLine();
        String formatted_userName = unformatted_userName.toLowerCase();
        System.out.println("Welcome: "+formatted_userName);

        // check based on password usecase
        // 4th equals()
        System.out.println("Enter Your Password: ");
        String password = sc.nextLine();

        System.out.println("Re-enter Your Password Again: ");
        String passwordMatched = sc.nextLine();

        if (password.equals(passwordMatched)) {
            System.out.println("Password Changed Successfully");
        } else {
            System.out.println("Password Did not Match");
        }

        // check based on PAN usecase
        // 5th toUpperCase()
        System.out.println("Enter Your PAN: ");
        String panNumber = sc.nextLine();
        System.out.println("Your PAN: "+panNumber.toUpperCase());

        // check based on email context -> @ is must
        // 6th contains()
        System.out.println("Enter Your Email: ");
        String email = sc.nextLine();

        if (email.contains("@gmail.com") || email.contains("@GMAIL.com")) {
            System.out.println("Valid Gmail Account");
        } else {
            System.out.println("Only Provide Gmail Account");
        }

}
    
}