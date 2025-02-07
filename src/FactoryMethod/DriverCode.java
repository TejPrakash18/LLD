package FactoryMethod;

public class DriverCode {
    public static void main(String[] args) {
        Creater creater = new ConcreteFactoryA();
        Product product = creater.createProduct();
        product.use();

        Creater creater1 = new ConcreteFactoryB();
        Product product1 = creater1.createProduct();
        product1.use();


    }
}
