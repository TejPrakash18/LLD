package designpatterns.StrategyPattern.discount;

public class Main {
    public static void main(String[] args) {
        BillingService billingService = new BillingService();
        billingService.setDiscountStrategy(new NoDiscount());
        double noDis = billingService.calculateBill(20);
        System.out.println(noDis);

        billingService.setDiscountStrategy(new FestivalDiscount());
       double fesDis=  billingService.calculateBill(100);
        System.out.println(fesDis);
    }
}
