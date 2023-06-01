package TransportPackage;

public class Car extends Vehicle {
    protected int acTemp;

    public Car(double speed, double engineVolume, int gasNumber, int acTemp) {
        super(speed, engineVolume, gasNumber);
        this.acTemp = acTemp;
    }

    public void increaseAcTemp() {
        acTemp++;
    }
    public void printVehicleDetails() {
      super.printVehicleDetails();
         System.out.println("AC temperature is: " + acTemp);
    }
}