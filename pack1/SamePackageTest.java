package pack1;

public class SamePackageTest {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("Same Package - Differnt Class");
        System.out.println(p.publicName); // No Error
        System.out.println(p.protectedName); // No Error
        System.out.println(p.defaultName); // No Error
        // System.out.println(p.privateName); // Error Cannot access private outside the class
    }
}
