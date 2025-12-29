package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Youtube implements Channel{

    private final String channelName;

    public Youtube(String channelName){
        this.channelName = channelName;
    }

    List<Subscribers> subscriber = new ArrayList<>();
    @Override
    public void subscribe(Subscribers subscribers) {
        subscriber.add(subscribers);
    }

    @Override
    public void unsubscribe(Subscribers subscribers) {
        this.subscriber.remove(subscribers);
    }

    @Override
    public void notification(String videoTitle) {
        for(Subscribers s : subscriber){
            s.update(channelName, videoTitle);
        }
    }

    public void uploadVideo(String videoTitle){
        System.out.println("\n" + channelName + " Uploaded: " + videoTitle);
        notification(videoTitle);
    }
}
