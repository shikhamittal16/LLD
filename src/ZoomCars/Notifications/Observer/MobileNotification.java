package ZoomCars.Notifications.Observer;

import ZoomCars.Users.User;
import ZoomCars.Notifications.Notification;

public class MobileNotification implements Notification {
    @Override
    public void sendNotification(User user, String message) {
        System.out.println("mobile notification send to user" + user);
        System.out.println("with message" + message);
    }
}
