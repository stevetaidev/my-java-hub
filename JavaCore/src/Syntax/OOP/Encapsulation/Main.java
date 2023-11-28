package Syntax.OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 30);

        // Sử dụng phương thức getter để lấy thông tin
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Sử dụng phương thức setter để thiết lập thông tin
        person.setName("Tai Nguyen");
        person.setAge(30);

        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
    }
}
