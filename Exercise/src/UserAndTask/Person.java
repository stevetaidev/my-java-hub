package UserAndTask;

import java.util.*;


public class Person {
    private String name;
    private String id;

    // Hàm khởi tạo cho người dùng và tạo ID ngẫu nhiên cho người dùng
    public Person(String name) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}