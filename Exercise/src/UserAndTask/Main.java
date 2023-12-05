package UserAndTask;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();
        while (true) {
            // Display the action menu
            System.out.println("Please pick an action:");
            System.out.println("1. Create user");
            System.out.println("2. Create task");
            System.out.println("3. View information");
            System.out.println("4. Edit task");
            System.out.println("5. Delete task");
            System.out.println("6. Delete user");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Tạo một người dùng mới
                    System.out.println("Enter user name:");
                    String name = scanner.nextLine();
                    // Kiểm tra xem tên có chứa số hay không
                    // Nếu không chứa số trong tên, tạo người dùng mớ
                    if (!name.matches(".*\\d.*")) {
                        taskManager.createPerson(name);
                    } else {
                        System.out.println("Invalid name, please try again..");
                    }
                    break;
                case 2:
                    // Tạo một task mới
                    System.out.println("Enter user ID:");
                    UUID personId = UUID.fromString(scanner.nextLine());
                    System.out.println("Enter task name:");
                    String taskName = scanner.nextLine();
                    taskManager.createTask(personId, taskName);
                    break;
                case 3:
                    // Xem thông tin các task và user trong hệ thống.
                    taskManager.viewInfo();
                    break;
                case 4:
                    // Sửa tên của task theo ID.
                    System.out.println("Enter the ID of the task you want to edit:");
                    UUID taskIdToEdit = UUID.fromString(scanner.nextLine());
                    System.out.println("Enter the new task name:");
                    String newTaskName = scanner.nextLine();
                    taskManager.editTask(taskIdToEdit, newTaskName);
                    break;
                case 5:
                    // Xóa một task theo ID.
                    System.out.println("Enter the ID of the task you want to delete:");
                    UUID taskIdToDelete = UUID.fromString(scanner.nextLine());
                    taskManager.deleteTask(taskIdToDelete);
                    break;
                case 6:
                    // Xóa user theo ID.
                    System.out.println("Enter the ID of the user you want to delete:");
                    UUID personIdToDelete = UUID.fromString(scanner.nextLine());
                    taskManager.deleteUser(personIdToDelete);
                    break;
                case 7:
                    // Thoát khỏi chương trình.
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    // Nếu lựa chọn không hợp lệ, hiển thị thông báo và yêu cầu chọn lại.
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}
