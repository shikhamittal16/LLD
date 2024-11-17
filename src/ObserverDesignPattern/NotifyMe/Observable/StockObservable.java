package ObserverDesignPattern.NotifyMe.Observable;

import ObserverDesignPattern.NotifyMe.Observer.NotificationAlertObserver;

public interface StockObservable {
    void add(NotificationAlertObserver obj);

    void remove(NotificationAlertObserver obj);

    void notifySubscribers();

    int getStockCount();

    void setStockCount(int newStockAdded);
}
