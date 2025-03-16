package comportamiento;

import java.util.ArrayList;
import java.util.List;

public class Project implements ProjectSubject {
    private String projectId;
    private String status;
    private List<ProjectObserver> observers = new ArrayList<>();

    public Project(String projectId) {
        this.projectId = projectId;
        this.status = "CREATED";
    }

    @Override
    public void registerObserver(ProjectObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ProjectObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (ProjectObserver observer : observers) {
            observer.update(projectId, status, "Project status changed to " + status);
        }
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }
}
