public class myFirstBankClass {
    private String accountHolderName;
    private int accountNumber;
    private double accountBalance;

    public myFirstBankClass(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountBalance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposit of $" + amount + " successful");
        } else {
            System.out.println("Invalid amount for deposit");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (accountBalance >= amount) {
                accountBalance -= amount;
                System.out.println("Withdrawal of $" + amount + " successful");
            } else {
                System.out.println("Insufficient funds");
            }
        } else {
            System.out.println("Invalid amount for withdrawal");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: $" + accountBalance);
    }
}
