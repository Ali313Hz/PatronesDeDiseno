package org.example;

// Importar módulos específicos
import creacional.*;
import estructural.*;
import comportamiento.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("AI-Powered Project Management Platform Demo");
        System.out.println("==========================================\n");

        // ------------------ FACTORY METHOD ------------------
        System.out.println("PART 1: FACTORY METHOD PATTERN DEMO");
        System.out.println("----------------------------------");

        // Crear fábricas de tareas
        TaskFactory devFactory = new DevelopmentTaskFactory();
        TaskFactory designFactory = new DesignTaskFactory();

        // Crear tareas usando las fábricas
        Task backendTask = devFactory.createTask("Implement authentication API", 16);
        Task frontendTask = devFactory.createTask("Build dashboard components", 12);
        Task uiTask = designFactory.createTask("Design user interface mockups", 8);

        // Mostrar y ejecutar tareas
        System.out.println("Created tasks:");
        displayTaskInfo(backendTask);
        displayTaskInfo(frontendTask);
        displayTaskInfo(uiTask);

        System.out.println("\nExecuting tasks:");
        backendTask.execute();
        frontendTask.execute();
        uiTask.execute();

        // ------------------ OBSERVER PATTERN ------------------
        System.out.println("\nPART 2: OBSERVER PATTERN DEMO");
        System.out.println("--------------------------------");

        // Crear un proyecto y observadores
        Project project = new Project("AI-Platform");
        ProjectManager manager = new ProjectManager("Alice");
        DeveloperTeam devTeam = new DeveloperTeam("Beta Team");
        AIAssistant aiAssistant = new AIAssistant();

        // Registrar observadores
        project.registerObserver(manager);
        project.registerObserver(devTeam);
        project.registerObserver(aiAssistant);

        // Cambiar estado del proyecto
        System.out.println("Changing project status to IN_PROGRESS");
        project.setStatus("IN_PROGRESS");

        System.out.println("\nChanging project status to AT_RISK");
        project.setStatus("AT_RISK");

        // ------------------ ADAPTER PATTERN ------------------
        System.out.println("\nPART 3: ADAPTER PATTERN DEMO");
        System.out.println("--------------------------------");

        AIAnalyticsService aiService = new AIAnalyticsService();
        ProjectAnalytics analytics = new AIServiceAdapter(aiService);

        String projectId = "AI-PLATFORM-001";
        analytics.analyzeProjectProgress(projectId);
        System.out.println("Predicted completion rate: " + analytics.getPredictedCompletionRate());
        System.out.println("Estimated days to completion: " + analytics.getEstimatedDaysToCompletion());
    }

    private static void displayTaskInfo(Task task) {
        System.out.println("- " + task.getDescription() + " (Estimated: " + task.getEstimatedTime() + " hours)");
    }
}