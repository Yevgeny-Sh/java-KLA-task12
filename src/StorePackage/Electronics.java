package StorePackage;

public class Electronics extends Product {

    private String battery;
    private String manufacture;




    public Electronics(String name, double price,String battery,String manufacture) {
            super(name, price);
            this.battery = battery;
            this.manufacture = manufacture;
    }
}
