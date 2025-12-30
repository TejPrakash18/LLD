package designpatterns.templatemethod;

public class Coffee extends Beverage{
    @Override
    protected void brew() {
        System.out.println("Add Coffee Powder");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Add ice");
    }
}
