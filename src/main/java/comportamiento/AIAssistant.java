package comportamiento;

public class AIAssistant implements ProjectObserver {
    @Override
    public void update(String projectId, String status, String message) {
        System.out.println("AI Assistant processing status change: " + message);
    }
}
