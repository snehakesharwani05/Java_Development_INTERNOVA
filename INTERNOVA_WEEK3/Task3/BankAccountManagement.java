import java.util.Scanner;

class BankAccount {
    String accountHolderName;
    long accountNumber;
    double balance;

    // Static variable
    static int totalAccounts = 0;

    // Constructor
    BankAccount(String accountHolderName, long accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;

        totalAccounts++;
    }

    // Display account details
    void displayAccountDetails() {
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Account Number      : " + accountNumber);
        System.out.println("Balance             : Rs" + balance);
        System.out.println("-------------------------------");
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Account 1
        System.out.println("Enter details for Account 1:");
        System.out.print("Account Holder Name: ");
        String name1 = sc.nextLine();

        System.out.print("Account Number: ");
        long number1 = sc.nextLong();

        System.out.print("Balance: ");
        double balance1 = sc.nextDouble();
        sc.nextLine();

        BankAccount account1 =
                new BankAccount(name1, number1, balance1);

        // Account 2
        System.out.println("\nEnter details for Account 2:");
        System.out.print("Account Holder Name: ");
        String name2 = sc.nextLine();

        System.out.print("Account Number: ");
        long number2 = sc.nextLong();

        System.out.print("Balance: ");
        double balance2 = sc.nextDouble();
        sc.nextLine();

        BankAccount account2 =
                new BankAccount(name2, number2, balance2);

        // Account 3
        System.out.println("\nEnter details for Account 3:");
        System.out.print("Account Holder Name: ");
        String name3 = sc.nextLine();

        System.out.print("Account Number: ");
        long number3 = sc.nextLong();

        System.out.print("Balance: ");
        double balance3 = sc.nextDouble();

        BankAccount account3 =
                new BankAccount(name3, number3, balance3);

        // Display details
        System.out.println("\n===== BANK ACCOUNT DETAILS =====");

        account1.displayAccountDetails();
        account2.displayAccountDetails();
        account3.displayAccountDetails();

        // Display total accounts
        System.out.println("Total Number of Accounts: "
                + BankAccount.totalAccounts);

        sc.close();
    }
}