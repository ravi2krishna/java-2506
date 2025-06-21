package abstraction;

public class HP implements Laptop {

    // implement abstract methods
    public void usbA(){
        System.out.println("HP Style USB-A");
    };

    public void hdmi(){
        System.out.println("HP Style HDMI");
    };

    public void usbC(){
        System.out.println("HP Style USB-C");
    }; 

}
