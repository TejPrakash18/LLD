package designpatterns.command;

public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();

        Command lightOn = new TurnOnLight(light);
        Command lightOff = new TurnOffLight(light);

        Command fanOn = new TurnOnFan(fan);
        Command fanOff = new TurnOffFan(fan);

        Remote remote = new Remote();
        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(lightOff);
        remote.pressButton();

        remote.setCommand(fanOn);
        remote.pressButton();

        remote.setCommand(fanOff);
        remote.pressButton();
    }
}
