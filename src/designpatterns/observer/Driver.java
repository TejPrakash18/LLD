package designpatterns.observer;

public class Driver {
    public static void main(String[] args) {
        Youtube channel = new Youtube("TechWithTej");

        Subscribers s1 = new UserSubscriber("Tej");
        Subscribers s2 = new UserSubscriber("Tripti");

        channel.subscribe(s1);
        channel.subscribe(s2);

        channel.uploadVideo("Observer Design Pattern explained");

        channel.unsubscribe(s2);

        channel.uploadVideo("Strategy Design pattern Explained");

    }
}
