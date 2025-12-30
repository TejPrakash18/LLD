package designpatterns.state;

public class GreenLightState implements State {

    @Override
    public void handleRequest(Context context) {
        System.out.println("🟢 Green light: Cars can GO");
        context.setCurrentState(new YellowLightState());
    }
}
