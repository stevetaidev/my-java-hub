package Collections;
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Tạo một ArrayList để lưu trữ danh sách sản phẩm
        List<String> productList = new ArrayList<>();

        // Thêm phần tử vào danh sách
        productList.add("Java");
        productList.add("C#");
        productList.add("Javascript");
        productList.add("Python");

        // In ra danh sách
        System.out.println("Nội dung của list:");
        System.out.println(productList);

        // Truy cập phần tử bằng chỉ mục
        String productAtIndex2 = productList.get(2);
        System.out.println("Phần tử tại chỉ mục 2: " + productAtIndex2);

        // Sửa đổi sản phẩm
        productList.set(1, "Go Lang");
        System.out.println("Danh sách sau khi sửa đổi:");
        System.out.println(productList);

        // Xóa sản phẩm
        productList.remove(0);
        System.out.println("Danh sách sau khi xóa phần tử đầu tiên:");
        System.out.println(productList);

        // Kiểm tra xem một phần tử có trong danh sách hay không
        boolean containsOnePlus = productList.contains("OnePlus");
        System.out.println("Có OnePlus trong danh sách: " + containsOnePlus);

        // Lấy kích thước của danh sách
        int size = productList.size();
        System.out.println("Số lượng phần tử trong list: " + size);
    }
}

