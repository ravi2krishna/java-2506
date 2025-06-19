package encapsulation;

public class Teacher {
    public static void main(String[] args) {
        // NewStudent s = new NewStudent(100);
        // s.isAttended = true; // this is not good practise -> we have some special methods to hanlde this data
        // System.out.println("Teacher Assigned Student Attendance");

        Student s = new Student(100);
        s.setAttendance(true);
        s.getAttendance();

       //  s.isAttended = false; // no encapsulation here
    }
}
