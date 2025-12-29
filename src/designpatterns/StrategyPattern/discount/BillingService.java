package designpatterns.StrategyPattern.discount;

public class BillingService {
    private DiscountStrategy discountStrategy;

   public void setDiscountStrategy(DiscountStrategy strategy){
       this.discountStrategy = strategy;
   }

   public double calculateBill(double price){
       return discountStrategy.applyDiscount(price);
   }
}
