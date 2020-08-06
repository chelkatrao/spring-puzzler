package spring.pattern;

import org.springframework.beans.factory.annotation.Autowired;

public interface Notification {

    void notification();

    String getNotificationType();

    @Autowired // Setter injection
    default void registerMySelf(NotificationSender notificationSender) {
        notificationSender.registerNotification(getNotificationType(), this);
    }

}
