package string_buffer_builder;

public class Comparision {
    public static void main(String[] args) {
        // capture start time
        long startTime = System.currentTimeMillis(); 
        String str = "Java";
        for (int i = 0; i < 10000; i++) {
            str = str.concat(" programming");
        }
        // capture end time
        long endTime = System.currentTimeMillis(); 
        System.out.println("Time Taken By Strings: "+(endTime-startTime));

        // capture start time
        long startTimeBuilder = System.currentTimeMillis(); 
        StringBuilder str_builder = new StringBuilder("Java");
        for (int i = 0; i < 10000; i++) {
            str_builder.append(" programming");
        }
        // capture end time
        long endTimeBuilder = System.currentTimeMillis(); 
        System.out.println("Time Taken By String Builder: "+(endTimeBuilder-startTimeBuilder));

        // capture start time
        long startTimeBuffer = System.currentTimeMillis(); 
        StringBuffer str_buffer = new StringBuffer("Java");
        for (int i = 0; i < 10000; i++) {
            str_buffer.append(" programming");
        }
        // capture end time
        long endTimeBuffer = System.currentTimeMillis(); 
        System.out.println("Time Taken By String Buffer: "+(endTimeBuffer-startTimeBuffer));

    }
}
