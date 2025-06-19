package encapsulation;

public class Student {

    // now ecapsulation is achieved by using private on data i.e variables
    // using setter and getter methods
    private int id; 
    private String name;
    private boolean isAttended;
    

    public Student(int id) {
        this.id = id;
    }

    public void setAttendance(boolean isAttended) {
        if(!isAttended)
        this.isAttended = isAttended;
        System.out.println("Teacher Assigned Student Attendance");
    }

    public boolean getAttendance(){
        System.out.println("Teacher Accessed Student Attendance");
        return isAttended;
    }

}