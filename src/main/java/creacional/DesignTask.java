package creacional;

public class DesignTask implements Task {
    private String description;
    private int estimatedHours;

    public DesignTask(String description, int estimatedHours) {
        this.description = description;
        this.estimatedHours = estimatedHours;
    }

    @Override
    public void execute() {
        System.out.println("Executing design task: " + description);
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getEstimatedTime() {
        return estimatedHours;
    }
}
