// Define the BankAccount class
public class BankAccount {

    // Private fields to store account information
    private String firstName, lastName;
    private double balance;
    private int accountID;

    // Constructor initializes the balance to zero
    public BankAccount() {
        this.balance = 0;
    }

    // Method to deposit money into the account
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
    }

    // Method to withdraw money from the account
    public void withdrawal(double withdrawalAmount) {
        this.balance -= withdrawalAmount;
    }

    // Setter method for the first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter methods for the first name
    public String getFirstName() {
        return (this.firstName != null) ? this.firstName : "Name Not Found.";
    }

    // Setter method for the last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter  method for the last name
    public String getLastName() {
        return (this.lastName != null) ? this.lastName : "Name Not Found.";
    }

    // Setter method for the account ID
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    // Getter method for the account ID
    public int getAccountID() {
        return this.accountID;
    }

    // Setter method for the account balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter method for the account balance
    public double getBalance() {
        return this.balance;
    }

    // Method to display an account summary
    public void accountSummary() {
        System.out.println("Account Owner: " + this.lastName + ", " + this.firstName);
        System.out.println("Account ID: " + this.accountID);
        System.out.println("Account Balance: " + this.balance);
    }

}