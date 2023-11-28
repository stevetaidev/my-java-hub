package Syntax.OOP.Abstraction;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0); // Tạo đối tượng Circle
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0); // Tạo đối tượng Rectangle

        System.out.println("Circle - Color: " + circle.color);
        System.out.println("Circle - Area: " + circle.getArea());
        System.out.println("Circle - Perimeter: " + circle.getPerimeter());

        System.out.println("Rectangle - Color: " + rectangle.color);
        System.out.println("Rectangle - Area: " + rectangle.getArea());
        System.out.println("Rectangle - Perimeter: " + rectangle.getPerimeter());
    }
}

