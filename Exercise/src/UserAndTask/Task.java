package UserAndTask;

import java.util.UUID;

public class Task {
    private UUID id;
    private String name;

    public Task(String name) {
        this.id = UUID.randomUUID(); // Tạo một UUID ngẫu nhiên
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
