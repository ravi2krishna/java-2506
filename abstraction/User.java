package abstraction;

public class User {
    public static void main(String[] args) {
        Lenovo lenovo = new Lenovo();
        lenovo.usbA(); // no abstraction 
        lenovo.usbC(); // no abstraction 
        lenovo.hdmi(); // no abstraction 
        lenovo.microSDSlot(); // no abstraction 

        // Implementing Abstraction
        Laptop abs = new Lenovo();
        abs.usbA(); // achieved abstraction
        abs.usbC(); // achieved abstraction


        Dell dell = new Dell();
        dell.hdmi();
        dell.usbA();
        dell.usbC();

        // special method
        dell.display4K();
        Laptop.audoJack();
        

    }
}
