package designpatterns.command;

public class TurnOffFan implements Command{
    private Fan fan;

    public TurnOffFan(Fan fan){
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.turnOffFan();
    }
}
