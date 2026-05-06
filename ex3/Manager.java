package ex3;

// Inheritance: Manager inherits from Employee
public class Manager extends Employee {
    private double bonus;

    // Constructor initializing all attributes
    public Manager(String name, double salary, double bonus) {
        super(name, salary); // Calling the parent constructor
        this.bonus = bonus;
    }

    // Method to calculate total salary
    public double getTotalSalary() {
        return getSalary() + bonus;
    }

    // Overridden toString to include bonus and total salary
    @Override
    public String toString() {
        return super.toString() + " | Bonus: " + bonus + " DA | Total Salary: " + getTotalSalary() + " DA";
    }
}