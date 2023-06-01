package StorePackage;

public class Clothing extends Product {

    private String size;
    private String material;

    public Clothing(String name, double price,String size,String material) {
        super(name, price);
        this.size = size;
        this.material = material;
    }


}
