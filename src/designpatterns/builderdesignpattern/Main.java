package builderdesignpattern;

public class Main {
    public static void main(String[] args) {

        CarBuilder builder = new CarBuilder();
        Director director = new Director(builder);
        Car car = director.buildLambo();
        System.out.println(car                  );
    }
}
