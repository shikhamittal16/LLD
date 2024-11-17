package ObserverDesignPattern.NotifyMe.Observer;

import ObserverDesignPattern.NotifyMe.Observable.StockObservable;

public class MobileNotificationImpl implements NotificationAlertObserver{
    StockObservable stockObservable;
    String mobileNo;

    public MobileNotificationImpl(StockObservable stockObservable, String mobileNo) {
        this.stockObservable = stockObservable;
        this.mobileNo = mobileNo;
    }
    @Override
    public void update() {
        sendSms(mobileNo , "product is in stock ... hurry up!");
    }

    public void sendSms(String mobileNo , String msg) {
        System.out.println("sms sent..." + " " + mobileNo);
    }
}
