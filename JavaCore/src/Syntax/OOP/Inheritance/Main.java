package Syntax.OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");

        // Gọi phương thức từ lớp cha
        myDog.eat();
        myDog.sleep();

        // Gọi phương thức của lớp con
        myDog.bark();
    }
}

