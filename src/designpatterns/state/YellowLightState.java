package designpatterns.state;

public class YellowLightState implements State {

    @Override
    public void handleRequest(Context context) {
        System.out.println("🟡 Yellow light: Prepare to STOP");
        context.setCurrentState(new RedLightState());
    }
}
