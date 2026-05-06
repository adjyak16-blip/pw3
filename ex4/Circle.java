package ex4;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius; // Area of circle[cite: 4]
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius; // Perimeter of circle[cite: 4]
    }

    @Override
    public String toString() {
        return "Circle [Radius: " + radius + "]";
    }
}