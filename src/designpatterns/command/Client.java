package designpatterns.command;

public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();

        Command lightOn = new LightOn(light);
        Command lightOff = new LightOff(light);

        Command fanOn = new FanOn(fan);
        Command fonOff = new FanOff(fan);

        Remote remote = new Remote();
        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(lightOff);
        remote.pressButton();

        remote.setCommand(fanOn);
        remote.pressButton();
        remote.setCommand(fonOff);
        remote.pressButton();
    }
}
