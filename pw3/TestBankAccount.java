package pw3;

import java.util.Scanner;

public class TestBankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter owner name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();

        BankAccount account = new BankAccount(name, initialBalance);

        System.out.print("\nEnter amount to deposit: ");
        double dep = sc.nextDouble();
        account.deposit(dep);

        System.out.print("Enter amount to withdraw: ");
        double with = sc.nextDouble();
        account.withdraw(with);

        sc.nextLine(); 
        System.out.print("\nEnter a new name to update owner: ");
        String newName = sc.nextLine();
        account.setOwnerName(newName);

        System.out.println("\n--- Final Account Details ---");
        System.out.println(account.toString());

        sc.close();
    }
}
