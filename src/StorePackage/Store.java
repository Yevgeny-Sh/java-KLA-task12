package StorePackage;

import java.util.ArrayList;

public class Store {
    private ArrayList<Product> productsList;

    public Store() {
        productsList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productsList.add(product);
    }

    public void printProducts() {
        for (Product product : productsList) {
            System.out.println("Name: " + product.getName());
            System.out.println("Price: $" + product.getPrice());
        }
    }
}