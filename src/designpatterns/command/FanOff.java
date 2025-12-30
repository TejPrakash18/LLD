package designpatterns.command;

public class FanOff implements Command{
    private Fan fan;

    public FanOff(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.turnOffFan();
    }
}
