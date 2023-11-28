package Syntax.String;
import java.util.HashMap;
import java.util.Map;
/*
* Trong ví dụ này, sử dụng StringBuilder
* để xây dựng một câu SQL query động với các điều kiện tìm kiếm
* dựa trên các tham số từ searchConditions.
* Hiểu cách xây dựng câu SQL bằng cách nối các phần khác nhau lại với nhau
* và loại bỏ "AND" không cần thiết cuối cùng.
*
* */
public class StringBuilderSQLExample {

    public static void main(String[] args){
        Map<String, String> searchConditions = new HashMap<>();
        searchConditions.put("language", "Java");
        searchConditions.put("level", "Biginner");
        searchConditions.put("framework", "Spring");

        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("SELECT * FROM tutorials"); // Lấy tất cả các bản ghi từ bảng tutorials


    }
}
