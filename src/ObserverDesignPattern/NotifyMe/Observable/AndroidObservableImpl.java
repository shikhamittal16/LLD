package ObserverDesignPattern.NotifyMe.Observable;

import ObserverDesignPattern.NotifyMe.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class AndroidObservableImpl implements StockObservable{

    List<NotificationAlertObserver> notificationAlertObservers = new ArrayList<>();
    int stockCount = 0;
    @Override
    public void add(NotificationAlertObserver obj) {
        notificationAlertObservers.add(obj);
    }

    @Override
    public void remove(NotificationAlertObserver obj) {
        notificationAlertObservers.remove(obj);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer : notificationAlertObservers) {
            observer.update();
        }
    }

    @Override
    public int getStockCount() {
        return 0;
    }

    @Override
    public void setStockCount(int newStockAdded) {

    }
}
