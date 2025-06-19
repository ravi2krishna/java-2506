package pack1;

public class Person {
    // Anywhere i should be able to access
    public String publicName = "Public Name";

    // protected same package & other packages where inheritance is applicable
    protected String protectedName = "Protected name";

    // default is only within the package, if we dont specify any access modifier its default modifier is default
    String defaultName = "Default Name";

    // private is only within same class
    private String privateName = "Private Name";

    // prepare method to demonstrate access modifiers
    public void display(){
        System.out.println("Inside The Same Class");
        System.out.println(publicName); // No Error
        System.out.println(protectedName); // No Error
        System.out.println(defaultName); // No Error
        System.out.println(privateName); // No Error
    }

}
