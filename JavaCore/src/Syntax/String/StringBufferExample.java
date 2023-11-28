package Syntax.String;

import Generics.List;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(); // Khởi tạo một StringBuffer rỗng

        sb.append("I Love" + " " + "Java"); // Thêm chuỗi "Hello" vào sb
        sb.append(" ");     // Thêm khoảng trắng vào sb
        sb.append(" || I Love C# "); //


        String result = sb.toString(); // Chuyển StringBuffer thành String
        System.out.println(result);


    }
}

