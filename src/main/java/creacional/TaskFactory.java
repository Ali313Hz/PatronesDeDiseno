package creacional;

public abstract class TaskFactory {
    public abstract Task createTask(String description, int estimatedHours);
}
