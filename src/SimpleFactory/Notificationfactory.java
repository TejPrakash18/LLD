package SimpleFactory;

public class Notificationfactory {
    public static Notification createNotification(String type){
        if(type == null || type.isEmpty()){
            return null;
        }
        switch (type.toLowerCase()){
            case "sms":
                return new SMSNotification();

            case "email":
                return new EmailNotification();
            case "whatsapp":
                return new WhatsAppNotification();

            default: throw new IllegalArgumentException("Unknown notification: "+ type);

        }
    }
}
