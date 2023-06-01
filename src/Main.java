import OfficeSuppliesPackage.Pen;
import StorePackage.Clothing;
import StorePackage.Electronics;
import StorePackage.Product;
import StorePackage.Store;
import TransportPackage.Car;
import TransportPackage.Vehicle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //public access modifier allows unrestricted access from any other class or package.
        //protected access modifier allows access within the same package or subclasses
        //default  access modifier allows access within the same package but not from outside the package
        //private access modifier restricts access to the same class only (not even from subclass).


        Store store = new Store();

        Product product1 = new Product("Phone", 4919.99);
        Product product2 = new Product("Laptop", 999.99);

        store.addProduct(product1);
        store.addProduct(product2);

        store.printProducts();



        Vehicle vehicle = new Vehicle(100.0, 2.0, 12345);
        vehicle.printVehicleDetails();

        Car car = new Car(120.0, 1.8, 67890, 20);
        car.printVehicleDetails();

        car.increaseAcTemp();
        car.printVehicleDetails();

        Computer computer = new Computer();
        computer.printDetails();


        CreditCard card=new CreditCard(10);
        card.withdraw(500);

        Pen pen=new Pen();
        pen.delete();

        ValueHolder<Integer> intHolder = new ValueHolder<>(10);
        System.out.println("Integer value: " + intHolder.getValue());
        intHolder.setValue(5);
        System.out.println("changed Integer value: " + intHolder.getValue());

        ValueHolder<String> stringHolder = new ValueHolder<>("Hello");
        System.out.println("String value: " + stringHolder.getValue());
        stringHolder.setValue("hi");
        System.out.println("changed String value: " + stringHolder.getValue());

        ValueHolder<Boolean> booleanHolder = new ValueHolder<>(true);
        System.out.println("Boolean value: " + booleanHolder.getValue());
        booleanHolder.setValue(false);
        System.out.println("changed Boolean value: " + booleanHolder.getValue());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7): ");
        int number = scanner.nextInt();
        scanner.close();
        DayOfWeek.printDayOfWeek(number);

        Product[] productArray = new Product[2];

        Electronics device1 = new Electronics("a",2,"aaa","sony");
        Clothing cloth1 = new Clothing("cloth1",3,"xl","cotton");
        productArray[0]=device1;
        productArray[1]=cloth1;

        for (Product product : productArray) {
            product.printDetails();
        }

    }
}
