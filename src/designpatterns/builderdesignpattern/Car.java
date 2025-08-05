package builderdesignpattern;

public class Car {
    private final int id;
    private final String brand;
    private final String model;
    private final String color;

    public Car(int id, String brand, String model, String color) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString(){
        return "Car{id=" + id + ", brand='" + brand + "', model='" + model + "', color='" + color + "'}";

    }
}
