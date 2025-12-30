package designpatterns.templatemethod;

public class Tea extends Beverage{
    @Override
    protected void brew() {
        System.out.println("steeping tea leaves");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Add Lemon!!");
    }

}
