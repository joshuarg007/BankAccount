// Define the CheckingAccount class, which extends BankAccount
public class CheckingAccount extends BankAccount {

    // INterest rate on account
    private double interestRate;

    // Constructor initializes the interest rate for CheckingAccount
    public CheckingAccount() {
        this.interestRate = 0.015;
    }

    // Method to process withdrawals with overdraft protection
    public void processWithdrawal(int withdrawal) {

        // Check if withdrawal amount is greater than the account balance
        if (withdrawal > this.getBalance()) {
            // Apply a $30 overdraft fee
            this.setBalance(this.getBalance() - 30.0);

            // Display a message about insufficient funds and the overdraft fee
            System.out.println("Insufficient Funds. $35 overdraft fee applied.");
            System.out.println("Balance: " + this.getBalance());
            
        } else {
            // If sufficient funds, proceed with the withdrawal
            this.withdrawal(withdrawal);
        }
    }

    public void displayAccount() {
        this.accountSummary();
        System.out.println("Interest Rate: " + this.interestRate);
    }

}  // END CheckingAccount