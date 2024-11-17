package ObserverDesignPattern.NotifyMe.Observer;

import ObserverDesignPattern.NotifyMe.Observable.StockObservable;

public class EmailNotificationImpl implements NotificationAlertObserver{

    StockObservable stockObservable;
    String emailId;

    public EmailNotificationImpl(StockObservable stockObservable, String emailId) {
        this.stockObservable = stockObservable;
        this.emailId = emailId;
    }
    @Override
    public void update() {
        sendEmail(emailId , "product is in stock ... hurry up!");
    }

    public void sendEmail(String email , String msg) {
        System.out.println("email sent..." + " " + email);
    }
}
