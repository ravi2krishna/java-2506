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


}
    
}