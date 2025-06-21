package abstraction;

public class User {
    public static void main(String[] args) {
        Lenovo lenovo = new Lenovo();
        lenovo.usbA();
        lenovo.usbC();
        lenovo.hdmi();
        lenovo.microSDSlot();

        Dell dell = new Dell();
        dell.hdmi();
        dell.usbA();
        dell.usbC();

        // special method
        dell.display4K();
        Laptop.audoJack();
        

    }
}
