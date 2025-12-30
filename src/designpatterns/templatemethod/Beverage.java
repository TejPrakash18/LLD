package designpatterns.templatemethod;

public abstract class Beverage {

    public final void steps(){
        boilWater();
        brew();
        addCondiments();
        pourInCup();

    }
    private void boilWater(){
        System.out.println("Boiling water!!!");
    }

    private void pourInCup(){
        System.out.println("Pouring into the cup!!!");
    }
    protected abstract void addCondiments();
    protected abstract void brew();
}
