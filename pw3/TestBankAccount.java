package pw3;

import java.util.Scanner;

public class TestBankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an instance of BankAccount[cite: 7]
        System.out.print("Enter owner name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();

        BankAccount account = new BankAccount(name, initialBalance);

        // Perform deposit operation[cite: 7]
        System.out.print("\nEnter amount to deposit: ");
        double dep = sc.nextDouble();
        account.deposit(dep);

        // Perform withdrawal operation[cite: 7]
        System.out.print("Enter amount to withdraw: ");
        double with = sc.nextDouble();
        account.withdraw(with);

        // Observe behavior using setter[cite: 7]
        sc.nextLine(); // Clear buffer
        System.out.print("\nEnter a new name to update owner: ");
        String newName = sc.nextLine();
        account.setOwnerName(newName);

        // Display final account information[cite: 7]
        System.out.println("\n--- Final Account Details ---");
        System.out.println(account.toString());

        sc.close();
    }
}
