package designpatterns.SimpleFactory;

public class Notificationfactory {

    public static Notification createNotification(String type){
        if(type == null || type.isEmpty()){
            return null;
        }
        return switch (type.toLowerCase()) {
            case "sms" -> new SMSNotification();
            case "email" -> new EmailNotification();
            case "whatsapp" -> new WhatsAppNotification();
            default -> throw new IllegalArgumentException("Unknown notification: " + type);
        };
    }
}
