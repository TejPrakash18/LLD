package designpatterns.state;

public class RedLightState implements State {

    @Override
    public void handleRequest(Context context) {
        System.out.println("🔴 Red light: Cars must STOP");
        context.setCurrentState(new GreenLightState());
    }
}
