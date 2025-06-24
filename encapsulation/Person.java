package encapsulation;

public class Person {
    // common attributes Student, Trainer, etc
    // apply encapsulation --> use private access modifier
    private int personID;
    private String personName;
    private int personAge;
    private int personMobileNumber;

    // Implement Setters & Getters
    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    // set some conditional based on age
    public void setPersonAge(int personAge) {
        // age must be positive
        if (personAge > 0) {
            this.personAge = personAge;
        } else {
            System.out.println("Invalid Age Provided");
        }
    }

    public int getPersonMobileNumber() {
        return personMobileNumber;
    }

    public void setPersonMobileNumber(int personMobileNumber) {
        this.personMobileNumber = personMobileNumber;
    }


    public void displayInfo(){
        System.out.println("ID :" +personID);
        System.out.println("Name :" +personName);
        System.out.println("Age :" +personAge);
        System.out.println("Mobile :" +personMobileNumber);
    }

}
