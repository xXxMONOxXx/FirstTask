package by.mishastoma.customarray.observer;

public interface Observable {

    public void notifyObservers();

    public void attach(Observer observer);

    public void detach(Observer observer);
}
