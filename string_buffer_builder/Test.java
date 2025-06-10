package string_buffer_builder;

public class Test {
    public static void main(String[] args) {
        
        String str1 = "hello ";
        System.out.println("Before Modification "+str1);
        System.out.println(str1.concat("ravi"));
        System.out.println("After Modification "+str1);
        System.out.println("=====================");

        // String Builder
        StringBuilder str2 = new StringBuilder("hello ");
        System.out.println("Before Modification "+str2);
        System.out.println(str2.append("ravi"));
        System.out.println("After Modification "+str2);
        System.out.println("=====================");

        // String Buffer
        StringBuffer str3 = new StringBuffer("hello ");
        System.out.println("Before Modification "+str3);
        System.out.println(str3.append("ravi"));
        System.out.println("After Modification "+str3);

    }
}
