package UserAndTask;

import java.util.*;

public class TaskManager {

    // Lưu trữ danh sách các task theo user. Key là ID của user và value là HashMap chứa danh sách các task của người dùng đó.
    // Vì một user sở hữu nhiều task nên ta sử dụng HashMap để lưu trữ danh sách các task của user đó.
    private HashMap<String, HashMap<String, String>> userTasks = new HashMap<>();
    public void addTask(String userId, String task) {
        // Hàm thêm task vào danh sách task của user
        // Nếu user chưa có task nào, tạo một HashMap mới để lưu trữ danh sách task của user.
        // Nếu user đã có task, ta lấy HashMap cũ để thêm task mới vào.
        // Sử dụng UUID.randomUUID() để tạo ID ngẫu nhiên cho task.
        String taskId = UUID.randomUUID().toString();

        // Kiểm tra xem user đã có task nào chưa, nếu chưa thì tạo một HashMap mới để lưu trữ danh sách task của user.
        if (!userTasks.containsKey(userId)) {
            userTasks.put(userId, new HashMap<>());
        }
        userTasks.get(userId).put(taskId, task);
    }

    public void viewTasks(Person person) {

        //Hàm hiển thị danh sách UserID, UserName, TaskID, TaskName

        System.out.println("User ID: " + person.getId() + ", Name: " + person.getName());

        // Kiểm tra xem user có task hay không, nếu có thì hiển thị danh sách task
        if (userTasks.containsKey(person.getId())) {
            // Duyệt qua danh sách task của user và in ra màn hình
            for (Map.Entry<String, String> entry : userTasks.get(person.getId()).entrySet()) {
                System.out.println("Task ID: " + entry.getKey() + ", Task: " + entry.getValue());
            }
        }
    }


    // Hàm chỉnh sửa task của user theo ID task và task mới.
    public void editTask(String userId, String taskId, String newTask) {

        // Kiểm tra xem ID user và ID task có tồn tại trong danh sách không
        // Nếu có thì sửa task theo ID task và task mới.
        if (userTasks.containsKey(userId) && userTasks.get(userId).containsKey(taskId)) {
            userTasks.get(userId).put(taskId, newTask);
        } else {
            System.out.println("User ID or Task ID not found.");
        }
    }

    // Hàm xóa task của user theo ID task.
    public void deleteTask(String userId, String taskId) {
        // Kiểm tra xem ID user và ID task có tồn tại trong danh sách không
        // Nếu có thì xóa task khỏi danh sách
        if (userTasks.containsKey(userId)) {
            userTasks.get(userId).remove(taskId);
        }
    }

    // Hàm xóa user theo ID.
    public void deleteUser(String userId) {
        userTasks.remove(userId);
    }
}