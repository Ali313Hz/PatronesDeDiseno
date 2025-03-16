package comportamiento;

public class ProjectManager implements ProjectObserver {
    private String name;

    public ProjectManager(String name) {
        this.name = name;
    }

    @Override
    public void update(String projectId, String status, String message) {
        System.out.println("Project Manager " + name + " notified: " + message);
    }
}
