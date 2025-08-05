package solidforclass.liskov;

public class Driver {
    public static void main(String[] args) {
        Bird ostrich = new Ostrich();
        ostrich.sound();

        System.out.println("////");

        Bird1 sparrow = new Sparrow();

        sparrow.fly();
        ostrich.sound();

    }
}
