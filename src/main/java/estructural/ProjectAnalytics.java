package estructural;

public interface ProjectAnalytics {
    void analyzeProjectProgress(String projectId);
    double getPredictedCompletionRate();
    int getEstimatedDaysToCompletion();
}
