package abstraction;

public interface Laptop {

    public static final String country= "INDIA";

    // abstract methods
    public void usbA();

    public void hdmi();

    public void usbC(); 
    
    // after 2 years 
    // public void microSDSlot(); // everyone should implement this

    // default method
    default void microSDSlot(){
        System.out.println("Implemented Default Micro-SD Slot");
    }

    // static method
    static void audoJack(){
        System.out.println("Fully Implemented Latest Audio Jack");
    }

}
