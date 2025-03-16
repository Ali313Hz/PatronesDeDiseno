package creacional;

public class DevelopmentTask implements Task {
    private String description;
    private int estimatedHours;

    public DevelopmentTask(String description, int estimatedHours) {
        this.description = description;
        this.estimatedHours = estimatedHours;
    }

    @Override
    public void execute() {
        System.out.println("Executing development task: " + description);
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
