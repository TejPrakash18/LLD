package designpatterns.StrategyPattern.discount;

public class FestivalDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double price) {
        return price * 0.8;
    }
}
