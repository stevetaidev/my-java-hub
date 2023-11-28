package StreamAPI;
import java.util.*;
import java.util.stream.Collectors;

public class StreamAPISample {
    public static void main(String[] args) {
        // Ví dụ danh sách các số nguyên
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Sử dụng StreamAPI để thực hiện các thao tác trên dữ liệu
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)  // Lọc ra các số chẵn
                .collect(Collectors.toList());  // Thu thập vào danh sách

        Set<Integer> uniqueNumbers = numbers.stream()
                .collect(Collectors.toSet());  // Thu thập vào tập hợp

        Map<Integer, String> numberToNameMap = numbers.stream()
                .collect(Collectors.toMap(
                        n -> n,
                        n -> "Number" + n
                ));  // Thu thập vào ánh xạ

        String joinedNumbers = numbers.stream()
                .map(Object::toString)
                .collect(Collectors.joining(",, "));  // Kết hợp thành chuỗi ngăn cách bằng dấu phẩy

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();  // Tính tổng các số nguyên

        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()  // Tính giá trị trung bình
                .orElse(0.0);

        // In kết quả
        System.out.println("Even Numbers: " + evenNumbers);  // Số chẵn
        System.out.println("Unique Numbers: " + uniqueNumbers);  // Số duy nhất
        System.out.println("Number to Name Map: " + numberToNameMap);  // Ánh xạ
        System.out.println("Joined Numbers: " + joinedNumbers);  // Chuỗi kết hợp
        System.out.println("Sum: " + sum);  // Tổng
        System.out.println("Average: " + average);  // Trung bình
    }
}
