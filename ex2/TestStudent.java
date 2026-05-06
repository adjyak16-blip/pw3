package ex2;

import java.util.Scanner;
import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();

        System.out.print("How many students do you want to enter? ");
        int count = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < count; i++) {
            System.out.println("\nEntering data for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            
            System.out.print("Age: ");
            int age = sc.nextInt();
            
            System.out.print("Grade: ");
            double grade = sc.nextDouble();
            sc.nextLine(); 

            studentList.add(new Student(name, age, grade));
        }

        System.out.println("\n--- Students List Results ---");
        for (Student s : studentList) {
            System.out.println(s.toString());
      
            if (s.isPassed()) {
                System.out.println("Status: Passed");
            } else {
                System.out.println("Status: Failed");
            }
            System.out.println("-----------------------------");
        }

        sc.close();
    }
}
