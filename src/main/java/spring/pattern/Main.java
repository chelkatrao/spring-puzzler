package spring.pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Main {

    private NotificationSender notificationSender;

    @Autowired
    public Main(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    @Scheduled(fixedDelay = 1000)
    public void init() {
        NotificationInfo notificationInfo = new NotificationInfo();
        notificationInfo.setName("telegram");
        notificationSender.sendNotification(notificationInfo);
    }
}
