package UserAndTask;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Person {
    private UUID id;
    private String name;
    private List<UUID> tasks; // Tạo một danh sách các UUID để lưu trữ các ID của các task

    public Person(String name) {
        this.id = UUID.randomUUID(); // Tạo một ID ngẫu nhiên
        this.name = name;
        this.tasks = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<UUID> getTasks() {
        return tasks;
    }

    public void addTask(UUID taskId) {
        tasks.add(taskId);
    }
}
