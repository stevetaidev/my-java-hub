package Syntax.Static;

class MathUtils {
    // Phương thức static tính tổng của hai số
    public static int add(int a, int b) {
        return a + b;
    }

    // Phương thức static tính giai thừa
    public static int factorial(int n) {
        if (n <= 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

public class Main {
    public static void main(String[] args) {
        int sum = MathUtils.add(5, 3); // Gọi phương thức static
        System.out.println("Sum: " + sum); // Sum: 8

        int fact = MathUtils.factorial(4); // Gọi phương thức static
        System.out.println("Factorial of 4: " + fact); // Factorial of 4: 24
    }
}