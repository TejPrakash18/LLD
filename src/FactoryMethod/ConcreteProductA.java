package FactoryMethod;

public class ConcreteProductA implements Product{
    @Override
    public void use() {
        System.out.println("Using Product A");
    }
}
