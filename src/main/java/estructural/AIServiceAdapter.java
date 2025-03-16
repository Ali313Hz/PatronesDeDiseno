package estructural;

public class AIServiceAdapter implements ProjectAnalytics {
    private AIAnalyticsService aiService;

    public AIServiceAdapter(AIAnalyticsService aiService) {
        this.aiService = aiService;
    }

    @Override
    public void analyzeProjectProgress(String projectId) {
        aiService.processData(projectId);
    }

    @Override
    public double getPredictedCompletionRate() {
        return aiService.getCompletionProbability();
    }

    @Override
    public int getEstimatedDaysToCompletion() {
        return aiService.calculateTimeToFinish();
    }
}
