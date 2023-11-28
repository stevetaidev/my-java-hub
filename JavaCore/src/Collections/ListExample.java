package Collections;
import java.util.ArrayList;
import java.util.List;

import java.util.LinkedList;

public class ListExample {
    public static void main(String[] args) {
        // Tạo một ArrayList kiểu Integer
        List<Integer> arrayList = new ArrayList<>();

        // Thêm phần tử vào ArrayList
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        // In danh sách ban đầu
        System.out.println("ArrayList ban đầu:");
        System.out.println(arrayList);

        // Sửa đổi một phần tử trong ArrayList
        arrayList.set(1, 25);
        System.out.println("\nArrayList sau khi sửa đổi:");
        System.out.println(arrayList);

        // Xóa phần tử từ ArrayList
        arrayList.remove(2);
        System.out.println("\nArrayList sau khi xóa phần tử thứ 2:");
        System.out.println(arrayList);

        // Tạo một LinkedList kiểu String
        List<String> linkedList = new LinkedList<>();

        // Thêm phần tử vào LinkedList
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("cherry");

        // In danh sách ban đầu
        System.out.println("\nLinkedList ban đầu:");
        System.out.println(linkedList);

        // Thêm phần tử vào đầu LinkedList
        linkedList.add(0, "grape");
        System.out.println("\nLinkedList sau khi thêm 'grape' vào đầu:");
        System.out.println(linkedList);
    }
}


