package Generics;
import java.util.ArrayList;

public class GenericCollectionExample {
    public static void main(String[] args) {
        ArrayList<String> listString = new ArrayList<>();

        // Thêm hai chuỗi vào listString sử dụng phương thức add() của ArrayList.
        listString.add("This is 1st string");
        listString.add("This is 2nd string");

        // Sử dụng for-each để lặp qua các phần tử trong listString và lưu vào biến newlistString.
        for (String newlistString : listString) {
            System.out.println(newlistString);
        }
    }
}
