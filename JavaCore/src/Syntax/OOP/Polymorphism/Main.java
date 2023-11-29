package Syntax.OOP.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Tạo một đối tượng Dog và gán cho một biến Animal
        Animal myCat = new Cat();

        myDog.makeSound();
        myCat.makeSound();
    }
}

