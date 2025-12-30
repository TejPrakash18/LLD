package designpatterns.command;


public class TurnOnLight implements Command {
    private Light light;

    public TurnOnLight(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.lightOn();
    }
}
