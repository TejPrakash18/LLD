package designpatterns.StrategyPattern;


public class PaymentContext {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void  payAmount(int amount){
        if (strategy == null){
            System.out.println("Payment strategy is not set.");
            return;
        }
        strategy.pay(amount);
    }
}
