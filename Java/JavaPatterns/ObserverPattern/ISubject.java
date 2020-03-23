package ObserverPattern;

public interface ISubject {
    void addObservers(IObserver observer);
    void removeObservers(IObserver observer);
    void notifyObservers();
}