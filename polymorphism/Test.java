package polymorphism;

public class Test {
    public void test(){
        System.out.println("Testing");
    }

}

class ManualTesting extends Test {

    @Override
    public void test() {
        System.out.println("Manual Testing");
    }
}

class AutoTesting extends Test {

    @Override
    public void test() {
        System.out.println("Automated Testing");
    }
}
