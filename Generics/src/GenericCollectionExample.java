import java.util.ArrayList;

public class GenericCollectionExample {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();

        stringList.add("New String List 1");
        stringList.add("New String List 2");

        // Sử dụng vòng lặp for-each để lặp qua các phần tử trong danhSachChuoi.
        for (String newStringList : stringList) {
            System.out.println(newStringList);
        }
    }
}
