package estructural;

public class AIAnalyticsService {
    public void processData(String dataId) {
        System.out.println("AI service processing data for project: " + dataId);
    }

    public double getCompletionProbability() {
        return 0.75;
    }

    public int calculateTimeToFinish() {
        return 14;
    }
}
