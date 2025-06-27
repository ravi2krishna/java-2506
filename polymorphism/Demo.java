package polymorphism;

public class Demo {
    // add two number
    public void add(int a, int b){
        System.out.println(a+b);
    }

    // add three number -> different number of parameters
    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

    // add two numbers -> type of parameters
    public void add(int a, double b) {
        System.out.println(a+b);
    }

    // add two number -> order of parameters
    public void add(double b, int a){
        System.out.println(b+a);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.add(2, 5);
        d.add(1, 2, 3);
        d.add(1, 1.5);
        d.add(1.5, 1);
        
    }

}
