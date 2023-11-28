package Syntax.String;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class JoinThreeTablesExample {

    public static void main(String[] args) {
        Connection connection = getConnection(); // Lấy kết nối đến cơ sở dữ liệu
        StringBuilder sql = new StringBuilder(); // Tạo một StringBuilder để xây dựng câu truy vấn SQL
        sql.append("SELECT o.order_id, o.order_date, c.customer_name, p.product_name "); // Thêm phần SELECT vào câu truy vấn
        sql.append("FROM orders o "); // Thêm phần FROM và bảng "orders" vào câu truy vấn
        sql.append("JOIN customers c ON o.customer_id = c.customer_id "); // Thêm phần JOIN và điều kiện kết nối với bảng "customers"
        sql.append("JOIN order_details od ON o.order_id = od.order_id "); // Thêm phần JOIN và điều kiện kết nối với bảng "order_details"
        sql.append("JOIN products p ON od.product_id = p.product_id"); // Thêm phần JOIN và điều kiện kết nối với bảng "products"

        try {
            PreparedStatement statement = connection.prepareStatement(sql.toString());
            ResultSet resultSet = statement.executeQuery(); // Thực thi truy vấn và lấy kết quả

            while (resultSet.next()) { // Duyệt qua từng dòng kết quả
                int orderId = resultSet.getInt("order_id"); // Lấy giá trị cột "order_id"
                String orderDate = resultSet.getString("order_date"); // Lấy giá trị cột "order_date"
                String customerName = resultSet.getString("customer_name"); // Lấy giá trị cột "customer_name"
                String productName = resultSet.getString("product_name"); // Lấy giá trị cột "product_name"

                System.out.println("Order ID: " + orderId + ", Order Date: " + orderDate + ", Customer Name: " + customerName + ", Product Name: " + productName);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static Connection getConnection() {
        // Code để thiết lập và trả về kết nối JDBC
        return null;
    }
}

