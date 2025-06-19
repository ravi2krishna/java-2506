package pack1;

public class OuterClass {
   
    public class PublicInner {
        public void show(){
            System.out.println("Public Inner Class");
        }
    }

    protected class ProtectedInner {
        public void show(){
            System.out.println("Protected Inner Class");
        }
    }

    class DefaultInner {
        public void show(){
            System.out.println("Default Inner Class");
        }
    }

    private class PrivateInner {
        public void show(){
            System.out.println("Private Inner Class");
        }
    }

    public void testInnerClasses(){
        new PublicInner().show();
        new ProtectedInner().show();
        new DefaultInner().show();
        new PrivateInner().show();
    }

    public static void main(String[] args) {
        OuterClass o = new OuterClass();
        o.testInnerClasses();
    }

}
