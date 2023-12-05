package UserAndTask;

import java.util.*;

public class TaskManager {
    private Map<UUID, Person> peopleMap = new HashMap<>();
    private Map<UUID, Task> tasksMap = new HashMap<>();

    public void createPerson(String name) {
        // Tạo một đối tượng Person mới và thêm vào Map
        Person person = new Person(name);
        peopleMap.put(person.getId(), person);
        System.out.println("User has been created with ID: " + person.getId());
    }

    public void createTask(UUID personId, String taskName) {
        // Tạo một đối tượng Task mới và thêm vào Map
        Person person = peopleMap.get(personId);
        // Nếu tìm thấy Person với ID đã cho, thêm Task vào Map
        if (person != null) {
            Task task = new Task(taskName);
            tasksMap.put(task.getId(), task);
            System.out.println("Task has been created with ID: " + task.getId() + " for user " + person.getName());
            person.addTask(task.getId());
        } else {
            System.out.println("User with ID: " + personId + " not found.");
        }
    }

    public void viewInfo() {
        // Hàm xem em thông tin các User và Task trong Map
        // Sử dụng for-each để duyệt qua các entry của Map
        for (Person person : peopleMap.values()) {
            System.out.println("------------------------INFORMATION--------------"   );
            System.out.println("User ID: " + person.getId());
            System.out.println("User Name: " + person.getName());
            System.out.println("Task Detail:");

            // Lấy danh sách các Task của User hiện tại và in ra thông tin các Task đó.
            List<UUID> userTasks = person.getTasks();
            // Nếu danh sách không rỗng, duyệt qua danh sách và in ra thông tin các Task
            if (!userTasks.isEmpty()) {
                for (UUID taskId : userTasks) {
                    Task task = tasksMap.get(taskId);
                    if (task != null) {
                        System.out.println("  Task ID: " + task.getId());
                        System.out.println("  Task Name: " + task.getName());
                        System.out.println("----------------------------"   );
                        System.out.println(" ");

                    }
                }
            } else {
                System.out.println("  No tasks found for this user.");
            }

            System.out.println();
        }
    }

    public void editTask(UUID taskId, String taskName) {
        // Hàm sửa thông tin một Task trong Map
        Task task = tasksMap.get(taskId);
        // Nếu tìm thấy Task với ID đã cho, thì sửa tên Task đó.
        if (task != null) {
            task.setName(taskName);
            System.out.println("Task has been edited successfully.");
        } else {
            System.out.println("Task with ID: " + taskId + " not found.");
        }
    }

    public void deleteTask(UUID taskId) {
        // Hàm xóa một Task trong Map theo ID đã cho.
        System.out.println("Task ID: " + taskId);
        System.out.println("Task Name: " + tasksMap.get(taskId).getName());
        System.out.println("Task ID: " + taskId);
        System.out.println("Task Name: " + tasksMap.get(taskId).getName());
        System.out.println("Task ID: " + taskId);
        System.out.println("Task Name: " + tasksMap.get(taskId).getName());
        System.out.println("Task ID: " + taskId);
        Task task = tasksMap.get(taskId);
        // Nếu tìm thấy Task với ID đã cho, thì xóa Task đó.
        if (task != null) {
            tasksMap.remove(taskId);
            System.out.println("Task has been deleted successfully.");
        } else {
            System.out.println("Task with ID: " + taskId + " not found.");
        }
    }

    public void deleteUser(UUID personId) {
        // Hàm xóa một User trong Map theo ID đã cho.
        Person person = peopleMap.get(personId);
        // Nếu tìm thấy User với ID đã cho, thì xóa User đó.
        if (person != null) {
            peopleMap.remove(personId);
            // và xóa tất cả các Task của User đó trong Map
            tasksMap.entrySet().removeIf(entry -> entry.getKey().equals(personId));
            System.out.println("User and their tasks have been deleted successfully.");
        } else {
            System.out.println("User with ID: " + personId + " not found.");
        }
    }
}
