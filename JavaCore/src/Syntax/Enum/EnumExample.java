package Syntax.Enum;

public class EnumExample {
    public static void main(String[] args) {

        // Khởi tạo một biến today kiểu Enum
        DayOfWeek today = DayOfWeek.MONDAY;

        // In ra ngày hiện tại
        System.out.println("Hôm nay là " + today);

        // Sử dụng switch để xử lý các giá trị Enum
        switch (today) {
            case MONDAY:
                System.out.println("Hôm nay là thứ Hai.");
                break;
            case FRIDAY:
                System.out.println("Hôm nay là thứ Sáu.");
                break;
            default:
                System.out.println("Hôm nay không phải là thứ Hai hoặc thứ Sáu.");
        }
    }
}
