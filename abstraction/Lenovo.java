package abstraction;

public class Lenovo implements Laptop {

    // implement abstract methods
    public void usbA(){
        System.out.println("Laptop To be sold only in " +Lenovo.country);
        System.out.println("Lenovo Style USB-A");
    };

    public void hdmi(){
        System.out.println("Lenovo Style HDMI");
    };

    public void usbC(){
        System.out.println("Lenovo Style USB-C");
    }; 

}
