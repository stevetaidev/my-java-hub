package Syntax.OOP.Inheritance;

// Lớp cha (superclass)
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Lớp con (subclass)
class Dog extends Animal {
    public Dog(String name) {
        super(name); // Gọi constructor của lớp cha để khởi tạo name
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}

