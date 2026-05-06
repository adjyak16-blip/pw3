package ex3;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    public double getTotalSalary() {
        return getSalary() + bonus;
    }
    public String toString() {
        return super.toString() + " | Bonus: " + bonus + " DA | Total Salary: " + getTotalSalary() + " DA";
    }
}
