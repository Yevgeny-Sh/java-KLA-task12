

 interface Ipowerable {
    void powerOn();
}
public class Computer implements Ipowerable {

    public void powerOn(){
        System.out.println("computer with power on!");
    }
    public void printDetails(){
        System.out.println("computer is on!");
    }

}
