package ex4;

import java.util.Scanner;
import java.util.ArrayList;

public class TestShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Polymorphism: One list to hold different types of shapes[cite: 4]
        ArrayList<Shape> shapes = new ArrayList<>();

        System.out.println("How many shapes do you want to create?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nSelect shape type: 1. Rectangle | 2. Circle");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter length: ");
                double l = sc.nextDouble();
                System.out.print("Enter width: ");
                double w = sc.nextDouble();
                shapes.add(new Rectangle(l, w));
            } else if (choice == 2) {
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                shapes.add(new Circle(r));
            } else {
                System.out.println("Invalid choice, skipping...");
            }
        }

        System.out.println("\n--- Shapes Calculations ---");
        for (Shape s : shapes) {
            System.out.println(s.toString());
            // System calls the correct area() based on the object type[cite: 4]
            System.out.printf("Area: %.2f | Perimeter: %.2f\n", s.area(), s.perimeter());
            System.out.println("---------------------------");
        }

        sc.close();
    }
}