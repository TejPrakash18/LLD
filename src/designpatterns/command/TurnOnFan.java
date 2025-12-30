package designpatterns.command;

public class TurnOnFan  implements Command{
    private Fan fan;

    public TurnOnFan(Fan fan){
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.turnOnFan();
    }
}
