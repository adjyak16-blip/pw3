package ex2;

// Inheritance: Student inherits from Person
public class Student extends Person {
    private double grade;

    // Constructor using the parent constructor (super)
    public Student(String name, int age, double grade) {
        super(name, age); 
        this.grade = grade;
    }

    // Check if the student has passed (grade >= 10)[cite: 8]
    public boolean isPassed() {
        return this.grade >= 10;
    }

    // Overridden toString method including grade[cite: 8]
    @Override
    public String toString() {
        return super.toString() + " | Grade: " + grade;
    }
}