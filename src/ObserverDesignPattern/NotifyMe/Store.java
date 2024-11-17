package ObserverDesignPattern.NotifyMe;

import ObserverDesignPattern.NotifyMe.Observable.IPhoneObservableImpl;
import ObserverDesignPattern.NotifyMe.Observable.StockObservable;
import ObserverDesignPattern.NotifyMe.Observer.EmailNotificationImpl;
import ObserverDesignPattern.NotifyMe.Observer.MobileNotificationImpl;
import ObserverDesignPattern.NotifyMe.Observer.NotificationAlertObserver;

public class Store {

    public static void main(String []arg) {
        StockObservable iPhoneObservable = new IPhoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailNotificationImpl(iPhoneObservable, "mittalshikha.023@gmail.com");
        NotificationAlertObserver observer2 = new MobileNotificationImpl(iPhoneObservable, "7300913910");
        iPhoneObservable.add(observer1);
        iPhoneObservable.add(observer2);

        iPhoneObservable.setStockCount(10);
    }
}
