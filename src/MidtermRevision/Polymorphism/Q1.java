package MidtermRevision.Polymorphism;

abstract class Shape {
    public abstract double area();

    public abstract double perimeter();
}
class Rectangle extends Shape {
    private double width, height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double area() {
        return width * height;
    }
    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}
class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
public class Q1{
    public static void main(String[] args) {
        Shape s = new Rectangle(10, 5);
        System.out.println("Area: " + s.area());
        System.out.println("Perimeter: " + s.perimeter());
        s = new Circle(7);
        System.out.println("Area: " + s.area());
        System.out.println("Perimeter: " + s.perimeter());
    }
}
