package Syntax.OOP.Abstraction;

// Lớp trừu tượng (abstract class)
abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    // Phương thức trừu tượng (abstract method) để tính diện tích
    public abstract double getArea();

    // Phương thức trừu tượng để tính chu vi
    public abstract double getPerimeter();
}

// Lớp concretize (lớp con) kế thừa từ lớp trừu tượng Shape
class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}

