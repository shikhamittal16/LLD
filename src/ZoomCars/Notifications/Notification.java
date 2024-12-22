package ZoomCars.Notifications;

import ZoomCars.Users.User;

public interface Notification {
    void sendNotification(User user, String message);
}
