package solidforclass.interfacesgregation;

public class Plane implements FlyableV, Vahicel{
    @Override
    public void fly() {
        System.out.println("Fly...");
    }

    @Override
    public void drive() {

        System.out.println("Drive.....");
    }
}
