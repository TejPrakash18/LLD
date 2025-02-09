package builderdesignpattern;

public class CarBuilder implements Builder{

    private int id;
    private String brand;
    private String model;
    private String color;

    @Override
    public Builder id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public Builder brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public Builder model(String model) {
        this.model =model;
        return this;
    }

    @Override
    public Builder color(String color) {
        this.color = color;
        return this;
    }

    @Override
    public Car build() {
        return new Car(id,brand,model,color);
    }
}
