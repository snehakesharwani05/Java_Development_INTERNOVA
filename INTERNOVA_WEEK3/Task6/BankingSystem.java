import java.util.Scanner;

// Abstract class
abstract class Account {

    // Abstract method
    abstract void calculateInterest();

    // Normal method
    void displayAccountType() {
        System.out.println("Account Type : Bank Account");
    }
}

// Child class
class BankAccount extends Account {

    // Private variables - Encapsulation
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    // Getters
    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Implementing abstract method
    @Override
    void calculateInterest() {
        double interest = balance * 0.05;
        System.out.printf("Interest at 5%% : Rs. %.2f%n", interest);
    }

    // Method to display account details
    void displayAccountDetails() {
        System.out.println("Account Number      : " + getAccountNumber());
        System.out.println("Account Holder Name : " + getAccountHolderName());
        System.out.printf("Balance             : Rs. %.2f%n", getBalance());
    }
}

// Main class
public class BankingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount();

        // Taking user input
        System.out.print("Enter Account Number: ");
        long accountNumber = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = sc.nextLine();

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        // Setting values using setters
        account.setAccountNumber(accountNumber);
        account.setAccountHolderName(accountHolderName);
        account.setBalance(balance);

        // Display account details
        System.out.println("\n===== ACCOUNT DETAILS =====");
        account.displayAccountDetails();

        // Calling normal method of abstract class
        account.displayAccountType();

        // Calling implemented abstract method
        account.calculateInterest();

        sc.close();
    }
}