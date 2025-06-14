package inheritance;

public class Person {
    // common attributes Student, Trainer, etc
    int personID;
    String personName;
    int personAge;
    int personMobileNumber;

    public Person (){}

    public Person(int personID,String personName,int personAge,int personMobileNumber) {
        this.personID = personID;
        this.personName = personName;
        this.personAge = personAge;
        this.personMobileNumber = personMobileNumber;
    }

    public void displayInfo(){
        System.out.println("ID :" +personID);
        System.out.println("Name :" +personName);
        System.out.println("Age :" +personAge);
        System.out.println("Mobile :" +personMobileNumber);
    }

}
