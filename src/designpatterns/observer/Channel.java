package designpatterns.observer;

public interface Channel {
    void subscribe(Subscribers subscribers);
    void unsubscribe(Subscribers subscribers);
    void notification(String videoTitle);

}
