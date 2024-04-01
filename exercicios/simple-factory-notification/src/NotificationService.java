import model.Notification;
import service.NotificationFactory;

public class NotificationService {
    public static void main(String[] args) {
        var sms = NotificationFactory.createNotification("sms");
        var email = NotificationFactory.createNotification("email");
        var push = NotificationFactory.createNotification("push");
        var nulo = NotificationFactory.createNotification("null");

        sms.notifyUser("Mensagem via SMS");
        email.notifyUser("Mensagem via email");
        push.notifyUser("Mensagem via push notification");
        nulo.notifyUser("Mensagem nula");
    }
}
