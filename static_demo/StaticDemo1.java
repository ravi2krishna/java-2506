package static_demo;

public class StaticDemo1 {

    // static variable
    static int count;

    // non-static variable
    int num;

    // static block --> 1st 
    static {
        System.out.println("Static Block Executed");
        count = 10;
    }

    // non-static block    
    {
        System.out.println("Non-Static Block Executed");
        num = 20;
        System.out.println(num);
    }

    // Constructor
    StaticDemo1(){
        System.out.println("Constructor Executed");
    }

    // non-static method
    public void display(){
        System.out.println("Non-Static Method");
        show();
    }

    // static method
    public static void show(){
        System.out.println("Static Method");
    }

    public static void main(String[] args) { // --> 2nd
        System.out.println("Main Method Executed");
        System.out.println("Count: "+StaticDemo1.count);
        StaticDemo1.show();
        // StaticDemo1 d1 = new StaticDemo1(); 
        // StaticDemo1 d2 = new StaticDemo1(); 
        // StaticDemo1 d3 = new StaticDemo1(); 
        // display(); --> not possible

    }
}
