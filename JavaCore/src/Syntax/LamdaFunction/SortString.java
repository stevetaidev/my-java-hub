package Syntax.LamdaFunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortString {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Sắp xếp danh sách bằng cách sử dụng lambda function
        Collections.sort(names, (name1, name2) -> name1.compareTo(name2));

        // In danh sách đã sắp xếp
        names.forEach((name) -> {
            System.out.println(name);
        });
    }
}

