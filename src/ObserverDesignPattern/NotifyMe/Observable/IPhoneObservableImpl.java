package ObserverDesignPattern.NotifyMe.Observable;

import ObserverDesignPattern.NotifyMe.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservableImpl implements StockObservable{

    List<NotificationAlertObserver> notificationAlertObserverList = new ArrayList<>();
    int stockCount = 0;
    @Override
    public void add(NotificationAlertObserver obj) {
        notificationAlertObserverList.add(obj);
    }

    @Override
    public void remove(NotificationAlertObserver obj) {
        notificationAlertObserverList.remove(obj);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer : notificationAlertObserverList) {
            observer.update();
        }
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if (stockCount == 0 && newStockAdded > 0) {
            notifySubscribers();
        }
        this.stockCount = stockCount + newStockAdded;
    }
}
