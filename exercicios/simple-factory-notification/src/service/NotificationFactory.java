package service;

import model.*;

public class NotificationFactory {
    public static Notification createNotification(String notf) {
        if (notf == null)
            return new NullNotification();

        return switch (notf.toLowerCase()) {
            case "sms" -> new SMSNotification();
            case "email" -> new EmailNotification();
            case "push" -> new PushNotification();
            default -> new NullNotification();
        };
    }
}
