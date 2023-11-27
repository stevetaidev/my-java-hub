package Generics;

public class GenericMethodExample {
    // Khởi tạo hàm generic printArray<T>, nhận một mảng các phần tử kiểu T.
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        String[] stringArray = {"Java", "C#", "Javascript", "Linux", "Docker"};

        System.out.print("Integer Array: ");
        printArray(intArray); // Gọi hàm printArray<T> và truyền vào mảng intArray.

        System.out.print("Double Array: ");
        printArray(doubleArray);// Gọi hàm printArray<T> và truyền vào mảng doubleArray.

        System.out.print("String Array: ");
        printArray(stringArray); // Gọi hàm printArray<T> và truyền vào mảng stringArray.
    }
}
