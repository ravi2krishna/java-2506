package abstraction;

abstract class NewLenovo implements  NewLaptop {

    int size = 43;
    String Brand;

    public NewLenovo () {
        Brand = "Lenovo";
    }

    public void usbA(){
        System.out.println("USB A Implemented");
    }

    public void hdmi() {
        System.out.println("HDMI Implemented");
    }

    // i don't know how to imlement
    abstract public void usbC(); 

    // my new functionality
    public void display2K (){

    }

}
