package Syntax.String;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JoinExample {

    public static void main(String[] args) {
        Connection connection = getConnection();
        StringBuilder sql = new StringBuilder(); // Tạo một StringBuilder để xây dựng câu truy vấn SQL
        sql.append("SELECT o.order_id, o.order_date, c.customer_name "); // Thêm phần SELECT vào câu truy vấn
        sql.append("FROM orders o "); // Thêm phần FROM và bảng "orders" vào câu truy vấn
        sql.append("JOIN customers c ON o.customer_id = c.customer_id"); // Thêm phần JOIN và điều kiện kết nối vào câu truy vấn
        try {
            PreparedStatement statement = connection.prepareStatement(sql.toString()); // Chuẩn bị câu truy vấn SQL
            ResultSet resultSet = statement.executeQuery(); // Thực thi truy vấn và lấy kết quả

            while (resultSet.next()) {
                int orderId = resultSet.getInt("order_id"); // Lấy giá trị cột "order_id"
                String orderDate = resultSet.getString("order_date"); // Lấy giá trị cột "order_date"
                String customerName = resultSet.getString("customer_name"); // Lấy giá trị cột "customer_name"

                System.out.println("Order ID: " + orderId + ", Order Date: " + orderDate + ", Customer Name: " + customerName);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Hàm để thiết lập và trả về kết nối đến cơ sở dữ liệu
    private static Connection getConnection() {
        // Code để thiết lập và trả về kết nối JDBC
        return null;
    }
}
