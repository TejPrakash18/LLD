package designpatterns.templatemethod;

public class Client {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        tea.steps();

        System.out.println();

        Beverage coffee = new Coffee();

        coffee.steps();

    }
}
