package designpatterns.observer;

public class UserSubscriber implements Subscribers{
    private String name;

    public UserSubscriber(String name){
        this.name = name;
    }
    @Override
    public void update(String channelName, String videoTitle) {
        System.out.println("Hey " + name + " new video uploaded on " + channelName + ": " + videoTitle);
    }
}
