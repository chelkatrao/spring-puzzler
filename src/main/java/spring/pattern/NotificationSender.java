package spring.pattern;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class NotificationSender {

    private Map<String, Notification> notificationMap = new HashMap<>();

    public void registerNotification(String notificationType, Notification notification) {
        notificationMap.put(notificationType, notification);
    }

    public void sendNotification(NotificationInfo notificationInfo) {
        notificationMap.get(notificationInfo.getName()).notification();
    }

}
