package creacional;

public class DevelopmentTaskFactory extends TaskFactory {
    @Override
    public Task createTask(String description, int estimatedHours) {
        return new DevelopmentTask(description, estimatedHours);
    }
}
