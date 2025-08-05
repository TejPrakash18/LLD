package builderdesignpattern;

public class Director {
    private CarBuilder carBuilder;

    public Director(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }

    public Car buildLambo(){
        return carBuilder.id(1).brand("Lamborghini").model("Adornment").color("RED").build();
    }
}
