package strings_demo;

import java.util.Scanner;

public class Test {

public static void main(String[] args) {
    //     String username = "ravikrishna";
    //     // 1st length () method
    //     // System.out.println(username.length());
    //     if (username.length()>=6) {
    //         System.out.println("Valid User Name");
    //         System.out.println("Welcome: "+username);
    //     }   else {
    //         System.out.println("InValid User Name, give atleast 6 letters");
    //     }

    //    // check based on character
    //     // 2nd charAt()
        Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter Your Gender: ");
    //     String gender = sc.nextLine();
    //     if (gender.charAt(0) == 'F' || gender.charAt(0) == 'M' || gender.charAt(0) == 'f' || gender.charAt(0) == 'm' ) {
    //         System.out.println("Valid");
    //     } else {
    //         System.out.println("InValid");
    //     }
        
    //     // check based on lowercase
    //     // 3rd toLowerCase()
    //     System.out.println("Enter Your Username: ");
    //     String unformatted_userName = sc.nextLine();
    //     String formatted_userName = unformatted_userName.toLowerCase();
    //     System.out.println("Welcome: "+formatted_userName);

    //     // check based on password usecase
    //     // 4th equals()
    //     System.out.println("Enter Your Password: ");
    //     String password = sc.nextLine();

    //     System.out.println("Re-enter Your Password Again: ");
    //     String passwordMatched = sc.nextLine();

    //     if (password.equals(passwordMatched)) {
    //         System.out.println("Password Changed Successfully");
    //     } else {
    //         System.out.println("Password Did not Match");
    //     }

    //     // check based on PAN usecase
    //     // 5th toUpperCase()
    //     System.out.println("Enter Your PAN: ");
    //     String panNumber = sc.nextLine();
    //     System.out.println("Your PAN: "+panNumber.toUpperCase());

    //     // check based on email context -> @ is must
    //     // 6th contains()
    //     System.out.println("Enter Your Email: ");
    //     String email = sc.nextLine();

    //     if (email.contains("@gmail.com") || email.contains("@GMAIL.com")) {
    //         System.out.println("Valid Gmail Account");
    //     } else {
    //         System.out.println("Only Provide Gmail Account");
    //     }

        // check based on phone number context -> country code
        // 7th startsWith()
        // System.out.println("Enter Your Number along with Country Code: ");
        // String phoneNumber = sc.nextLine();
        // if (phoneNumber.startsWith("+91")) {
        //     if (phoneNumber.length()<5) {
        //         System.out.println("Provide atleast 10 digit number");
        //     }
        //     System.out.println("Calling To India");
        // } else if (phoneNumber.startsWith("+44")) {
        //     System.out.println("Calling To UK");
        // } else if (phoneNumber.startsWith("+1")) {
        //     System.out.println("Calling To USA");
        // } 
        // else {
        //     System.out.println("Calling Supported to IND UK USA Only");
        // }

        // check based on email -> endig with
        // 8th endsWith()
        // System.out.println("Enter Your Email: ");
        // String email = sc.nextLine();

        // if (email.endsWith("@gmail.com")) {
        //     System.out.println("Sending to gmail");
        // } else if (email.endsWith("@outlook.com")){
        //     System.out.println("Sending to outlook");
        // } else {
        //     System.out.println("Use Only Gmail or Outlook");
        // }
        
        // // check based on email -> endig with
        // // 9th trim()
        // System.out.println("Enter Your Email: ");
        // String email = sc.nextLine();
        // System.out.println("Your Email: "+email.trim());

        // check based on email -> give only userid
        // 10th indexOf()
        // System.out.println("Enter Your Email: "); // ravi2krishna@gmailcom
        // String email = sc.nextLine();
        // // System.out.println(email.indexOf("@"));
        // if (email.indexOf("@") == -1) {
        //     System.out.println("Input Correct Email");
        // } else {
        //     for (int index = 0; index < email.indexOf("@");index++) {
        //         char userid[] = email.toCharArray();
        //         System.out.print(userid[index]);
        //     }
        // }

        // check based on file type extension
        // 11th lastIndexOf()
        // System.out.println("Enter Your File Name with extension: "); 
        // String fileType = sc.nextLine();
        // if (fileType.lastIndexOf(".") == -1) {
        //     System.out.println("Input Correct Filename");
        // } else {
        //     for (int index = fileType.indexOf("."); index < fileType.length();index++) {
        //         char extension[] = fileType.toCharArray();
        //         System.out.print(extension[index]);
        //     }
        //     System.out.println(" File Uploaded Sucessfully");
        // }
        
        // check based on file type extension
        // 12th substring()
        // System.out.println("Enter Your Product CODE to extract info: "); 
        // // "SHIRT-STYLE-SIZE"
        // String shirtInfo = sc.nextLine();
        // if (shirtInfo.indexOf("-") == -1) {
        //     System.out.println("Input Correct Product ID");
        // } else {
        //     System.out.println("Dress Type: "+shirtInfo.substring(0, 5));
        //     System.out.println("Model : "+shirtInfo.substring(6, 10));
        //     System.out.println("Size : "+shirtInfo.substring(11));
        // }

        // check based on file type extension
        // 13th split()
        String str = "hey ^how are ^you";
        String products = "id,name,desc,price";
        System.out.println(products.split("\\^"));
        String [] dataextreacted = str.split("\\^");
        for (int i=0;i<dataextreacted.length;i++) {
            System.out.println(dataextreacted[i]);
        }


}
    
}