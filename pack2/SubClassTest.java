package pack2;

import pack1.Person;

public class SubClassTest extends Person {
    public static void main(String[] args) {
        SubClassTest p = new SubClassTest();
        System.out.println("Differnt Package : Sub-Class");
        System.out.println("Same Package - Differnt Class");
        System.out.println(p.publicName); // No Error
        System.out.println(p.protectedName); // No Error
        // System.out.println(p.defaultName); // Error
        // System.out.println(p.privateName); // Error 
    }
}
