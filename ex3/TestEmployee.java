package ex3;

import java.util.Scanner;
import java.util.ArrayList;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Manager> managers = new ArrayList<>();

        System.out.print("Enter number of managers to add: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("\nManager " + (i + 1) + " details:");
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Base Salary: ");
            double salary = sc.nextDouble();

            System.out.print("Bonus: ");
            double bonus = sc.nextDouble();
            sc.nextLine();

      
            managers.add(new Manager(name, salary, bonus));
        }

        System.out.println("\n--- Managers List Information ---");
        for (Manager m : managers) {
            System.out.println(m.toString());
        }

        sc.close();
    }
}
