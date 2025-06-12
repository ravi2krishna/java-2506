package static_demo;

import java.util.Random;

public class Test {

    int number; // non-static
    static int new_number; // static

    public static void main(String[] args) {
        Test t1 = new Test(); // which memeory used --> heap
        // System.out.println(new Random().nextInt());
        t1.number = new Random().nextInt();

        Test t2 = new Test(); // which memeory used --> heap
        t2.number = new Random().nextInt();

        System.out.println(t1.number);
        System.out.println(t2.number);

        Test t3 =  new Test();
        t3.new_number =  new Random().nextInt(); 

        Test t4 =  new Test();
        t4.new_number =  new Random().nextInt(); 

        System.out.println(t3.new_number);
        System.out.println(t4.new_number);

        System.out.println("Calling Another Class Variable: "+Test2.test2Var);

    }

}
