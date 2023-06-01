package StorePackage;

public class DiscountedProduct extends Product {
    private double discount;

    public DiscountedProduct(String name, double price, double discount) {
        super(name, price);
        this.discount = discount;
    }
    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public double calculateFinalPrice() {
        double discountedPrice = getPrice() - discount;
        return discountedPrice;
    }
}