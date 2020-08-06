package spring.pattern;

import org.springframework.stereotype.Component;

@Component
public class SmsNotification implements Notification {
    @Override
    public void notification() {
        System.out.println("Sms dan 45 ta o'qilmagan xabar keldi");
    }

    @Override
    public String getNotificationType() {
        return "sms";
    }
}
