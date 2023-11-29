package MVCDemo;

import java.util.Scanner;

public class MVCPatternDemo {
    public static void main(String[] args) {
        // Khởi tạo view và controller
        StudentView view = new StudentView();
        StudentController controller = new StudentController(view);

        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;
        while (isRunning) {
            // Hiển thị menu lựa chọn
            System.out.println("\nOptions:");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display Student List");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Thêm sinh viên
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter student address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter student sex: ");
                    String sex = scanner.nextLine();
                    System.out.print("Enter student email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter student country: ");
                    String country = scanner.nextLine();
                    System.out.print("Enter student driver license: ");
                    String driverLicense = scanner.nextLine();
                    controller.addStudent(name, age, address, sex, email, country, driverLicense);
                    break;
                case 2:
                    // Chỉnh sửa thông tin sinh viên
                    System.out.print("Enter student index to edit: ");
                    int editIndex = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new age: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new address: ");
                    String newAddress = scanner.nextLine();
                    System.out.print("Enter new sex: ");
                    String newSex = scanner.nextLine();
                    System.out.print("Enter new email: ");
                    String newEmail = scanner.nextLine();
                    System.out.print("Enter new country: ");
                    String newCountry = scanner.nextLine();
                    System.out.print("Enter new driver license: ");
                    String newDriverLicense = scanner.nextLine();
                    controller.editStudent(editIndex - 1, newName, newAge, newAddress, newSex, newEmail, newCountry, newDriverLicense);
                    break;
                case 3:
                    // Xóa sinh viên
                    System.out.print("Enter student index to delete: ");
                    int deleteIndex = scanner.nextInt();
                    controller.deleteStudent(deleteIndex - 1);
                    break;
                case 4:
                    // Hiển thị danh sách sinh viên
                    controller.displayStudentList();
                    break;
                case 5:
                    // Kết thúc chương trình
                    isRunning = false;
                    break;
                default:
                    // Xử lý lựa chọn không hợp lệ
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
