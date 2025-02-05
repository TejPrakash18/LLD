package StatePattern;

public class PhoneOffState implements State{
    @Override
    public void pressPowerButton() {
        System.out.println("Turning on the phone.....");
    }
}
