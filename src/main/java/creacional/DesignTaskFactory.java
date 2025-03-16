package creacional;

public class DesignTaskFactory extends TaskFactory {
    @Override
    public Task createTask(String description, int estimatedHours) {
        return new DesignTask(description, estimatedHours);
    }
}
