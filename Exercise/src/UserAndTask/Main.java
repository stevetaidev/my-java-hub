package UserAndTask;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (true) {
            System.out.println("Enter your name:");
            name = scanner.nextLine();
            if (!name.matches(".*\\d.*")) { // Validate tên người dùng có chứa số không
                break;
            }
            System.out.println("Invalid Name, please try again.");
        }
        Person person = new Person(name);
        TaskManager taskManager = new TaskManager();

        while (true) {
            // Hiển th Menu
            System.out.println("1. Add task\n2. View user and tasks\n3. Edit task\n4. Delete task\n5. Delete user\n6. Exit");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter task:");
                    String task = scanner.nextLine();
                    taskManager.addTask(person.getId(), task); // Thêm task vào danh sách
                    break;
                case 2:
                    taskManager.viewTasks(person);
                    break;
                case 3:
                    System.out.println("Enter task ID:");
                    String taskId = scanner.nextLine();
                    System.out.println("Enter new task:");
                    String newTask = scanner.nextLine();
                    taskManager.editTask(person.getId(), taskId, newTask); // Chỉnh sửa task trong danh sách
                    break;
                case 4:
                    System.out.println("Enter task ID:");
                    String deleteTaskId = scanner.nextLine();
                    taskManager.deleteTask(person.getId(), deleteTaskId); // Xóa task khỏi danh sách
                    break;
                case 5:
                    taskManager.deleteUser(person.getId()); // Xóa người dùng khỏi danh sách
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}