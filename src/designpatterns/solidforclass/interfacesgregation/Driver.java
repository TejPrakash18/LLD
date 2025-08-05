package solidforclass.interfacesgregation;

public class Driver {
    public static void main(String[] args) {
        Vahicel car = new Car();
        car.drive();
        FlyableV plane = new Plane();
        car.drive();
        plane.fly();
    }
}
