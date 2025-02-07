package FactoryMethod;

public class ConcreteFactoryA extends Creater{
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
