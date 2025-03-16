package comportamiento;

public interface ProjectObserver {
    void update(String projectId, String status, String message);
}
