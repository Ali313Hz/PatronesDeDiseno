package comportamiento;

public class DeveloperTeam implements ProjectObserver {
    private String teamName;

    public DeveloperTeam(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public void update(String projectId, String status, String message) {
        System.out.println("Developer Team " + teamName + " received update: " + message);
    }
}
