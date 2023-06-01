package TransportPackage;

public class Vehicle extends Transport {
    private int gasNumber;

    public Vehicle(double speed, double engineVolume, int gasNumber) {
        super(speed, engineVolume);
        this.gasNumber = gasNumber;
    }

    public void printVehicleDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Speed: " + speed);
        System.out.println("Engine Volume: " + engineVolume);
        System.out.println("Gas Number: " + gasNumber);
    }
}