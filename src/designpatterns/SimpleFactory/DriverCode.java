package SimpleFactory;

public class DriverCode {
    public static void main(String[] args) {
        Notification notification =  Notificationfactory.createNotification("whatsApp");
        notification.notifyUser();

        Notification notification1 =  Notificationfactory.createNotification("email");
        notification1.notifyUser();
    }
}
