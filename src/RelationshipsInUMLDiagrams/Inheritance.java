package RelationshipsInUMLDiagrams;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting");
    }
}

public class Inheritance{
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // Calls the overridden method
    }
}
