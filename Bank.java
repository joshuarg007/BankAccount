// Define the Bank class
public class Bank {

    // The main method serves as the entry point for the program
    public static void main(String[] args) {

        // Create an instance of CheckingAccount and assign it to a BankAccount reference
        CheckingAccount bankAccount = new CheckingAccount();

        // Set account details
        bankAccount.setAccountID(1);
        bankAccount.setFirstName("John");
        bankAccount.setLastName("Doe");

        // Display the initial account summary
        bankAccount.displayAccount();

        // Deposit money into the account
        bankAccount.deposit(1000.5);

        // Display the account summary after the deposit
        bankAccount.displayAccount();

        // Withdraw money from the account
        bankAccount.withdrawal(500.25);

        // Display the account summary after the withdrawal
        bankAccount.displayAccount();

        // Print account information
        System.out.println("Account ID: " + bankAccount.getAccountID());
        System.out.println("Account Balance: " + bankAccount.getBalance());
        System.out.println("Account Owner: " + bankAccount.getLastName() + ", " + bankAccount.getFirstName());
    }
}