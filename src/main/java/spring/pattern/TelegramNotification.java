package spring.pattern;

import org.springframework.stereotype.Component;

@Component
public class TelegramNotification implements Notification {
    @Override
    public void notification() {
        System.out.println("Telegram messagengetdan 100 ta yangi xabar keldi !");
    }

    @Override
    public String getNotificationType() {
        return "telegram";
    }
}
