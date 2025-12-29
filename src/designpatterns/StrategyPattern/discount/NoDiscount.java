package designpatterns.StrategyPattern.discount;

public class NoDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double price) {
        return price;
    }
}
