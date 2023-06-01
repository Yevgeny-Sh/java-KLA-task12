public class CreditCard implements Ichargable {
    private double balance;

public CreditCard(double balance){
    this.balance=balance;
}


    public void withdraw(double amount) {
        System.out.println("connecting to billing service...");

        if (amount <= balance) {
            balance -= amount;
        } else {
            balance -= amount;
            System.out.println("you are now in debt! of"+balance);
        }
    }
}
