package encapsulation;

// achieved encapsulation
public class NewStudent {
    
    private int id;
    private String name;
    private  boolean isAttended;

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAttended(boolean isAttended) {
        this.isAttended = isAttended;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public boolean isAttended() {
        return isAttended;
    }

   
    
}