package abstraction;

public class Dell implements Laptop {

    // implement abstract methods
    public void usbA(){
        System.out.println("DELL Style USB-A");
    };

    public void hdmi(){
        System.out.println("DELL Style HDMI");
    };

    public void usbC(){
        System.out.println("DELL Style USB-C");
    }; 

    // Dell wants to some premium features for their customers
    public void display4K(){
        System.out.println("DELL 4K Screen");
    };

    public void microSDSlot(){
        System.out.println("DELL Micro SD Slot");
    }

}
