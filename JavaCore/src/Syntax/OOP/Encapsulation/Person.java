package Syntax.OOP.Encapsulation;

public class Person {
    // Dữ liệu của lớp Person được đóng gói bằng cách sử dụng private
    private String name;
    private int age;

    // Constructors để khởi tạo đối tượng
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Phương thức getter để lấy thông tin name
    public String getName() {
        return name;
    }

    // Phương thức setter để thiết lập giá trị name
    public void setName(String name) {
        this.name = name;
    }

    // Phương thức getter để lấy thông tin age
    public int getAge() {
        return age;
    }

    // Phương thức setter để thiết lập giá trị age
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }


}


