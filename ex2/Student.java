package ex2;


public class Student extends Person {
    private double grade;

    public Student(String name, int age, double grade) {
        super(name, age); 
        this.grade = grade;
    }
    public boolean isPassed() {
        return this.grade >= 10;
    }

    @Override
    public String toString() {
        return super.toString() + " | Grade: " + grade;
    }
}
