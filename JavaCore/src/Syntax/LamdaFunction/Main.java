package Syntax.LamdaFunction;

interface MyFunction {
    // Phương thức apply có 2 tham số kiểu int và trả về 1 giá trị kiểu int
    int apply(int x, int y);
}

public class Main {
    public static void main(String[] args) {
        // Sử dụng lambda function để cài đặt phương thức apply của hàm MyFunction
        MyFunction add = (a, b) -> a + b;
        MyFunction subtract = (a, b) -> a - b;

        System.out.println(add.apply(5, 3));
        System.out.println(subtract.apply(5, 3));
    }
}
