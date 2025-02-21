package solidforclass.liskov;

public class Sparrow implements Bird,Bird1{
    @Override
    public void sound() {
        System.out.println("Chur chur....");
    }

    @Override
    public void fly() {
        System.out.println("Flying....");
    }
}
