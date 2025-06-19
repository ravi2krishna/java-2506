package pack2;

import pack1.Person;

public class OtherPackageTest {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("Different Package : Non-Sub Class");
        System.out.println("Same Package - Differnt Class");
        System.out.println(p.publicName); // No Error
        // System.out.println(p.protectedName); // Error
        // System.out.println(p.defaultName); // Error
        // System.out.println(p.privateName); // Error 
    }
}
