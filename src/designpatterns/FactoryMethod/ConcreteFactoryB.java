package FactoryMethod;

public class ConcreteFactoryB extends Creater{
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
