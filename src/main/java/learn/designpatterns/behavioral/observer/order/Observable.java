package learn.designpatterns.behavioral.observer.order;

import learn.designpatterns.behavioral.observer.notification.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
