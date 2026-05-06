package pw3;

public class BankAccount {
    // Private attributes (Encapsulation)
    private String ownerName;
    private double balance;

    // Constructor
    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // Method to add money
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: " + amount + " DA");
        }
    }

    // Method to withdraw money with condition
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawn: " + amount + " DA");
        } else {
            System.out.println("Withdrawal failed: Insufficient balance or invalid amount.");
        }
    }

    // Getters[cite: 7]
    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    // Setters[cite: 7]
    public void setOwnerName(String name) {
        this.ownerName = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // toString method[cite: 7]
    @Override
    public String toString() {
        return "Account Owner: " + ownerName + " | Balance: " + balance + " DA";
    }
}