package Syntax.OOP.Polymorphism;

// Lớp Animal đại diện cho một đối tượng Animal cơ bản
class Animal {
    // Phương thức makeSound() của Animal in ra một thông điệp mặc định
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Lớp Dog là một lớp con của Animal và triển khai lại phương thức makeSound()
class Dog extends Animal {
    @Override
    public void makeSound() {
        // Phương thức makeSound() của Dog được ghi đè để in ra thông điệp "Dog barks"
        System.out.println("Dog barks");
    }
}

// Lớp Cat là một lớp con của Animal và triển khai lại phương thức makeSound()
class Cat extends Animal {
    @Override
    public void makeSound() {
        // Phương thức makeSound() của Cat được ghi đè để in ra thông điệp "Cat meows"
        System.out.println("Cat meows");
    }
}

