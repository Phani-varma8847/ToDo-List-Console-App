public class Task {
    private String title;
    private boolean completed;

    public Task(String title) {
        this.title = title;
        this.completed = false;
    }

    public void markCompleted() {
        this.completed = true;
    }

    public String toFileString() {
        return title + "|" + completed;
    }

    public static Task fromFileString(String line) {
        String[] parts = line.split("\\|");
        Task task = new Task(parts[0]);
        if (parts.length > 1 && Boolean.parseBoolean(parts[1])) {
            task.markCompleted();
        }
        return task;
    }

    public String toString() {
        return (completed ? "[✓] " : "[ ] ") + title;
    }
}
