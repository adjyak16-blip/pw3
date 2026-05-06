package ex4;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width; // Area of rectangle
    }

    @Override
    public double perimeter() {
        return 2 * (length + width); // Perimeter of rectangle
    }

    @Override
    public String toString() {
        return "Rectangle [Length: " + length + ", Width: " + width + "]";
    }
}