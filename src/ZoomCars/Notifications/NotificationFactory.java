package ZoomCars.Notifications;

import ZoomCars.Notifications.Notification;
import ZoomCars.Notifications.Observer.EmailNotification;
import ZoomCars.Notifications.Observer.MobileNotification;

//  to creating the instance of notification type we are using factory design pattern
public class NotificationFactory {

    public Notification getNotificationInstance(String type) {
        if (type.equals("mobile")){
            return new MobileNotification();
        } else if (type.equals("email")) {
            return new EmailNotification();
        } else {
            return null;
        }
    }
}
