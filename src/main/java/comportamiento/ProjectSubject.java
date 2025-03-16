package comportamiento;

public interface ProjectSubject {
    void registerObserver(ProjectObserver observer);
    void removeObserver(ProjectObserver observer);
    void notifyObservers();
}
