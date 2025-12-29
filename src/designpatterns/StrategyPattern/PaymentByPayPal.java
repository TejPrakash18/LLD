package designpatterns.StrategyPattern;

public class PaymentByPayPal implements  Strategy{

    private String email;

    PaymentByPayPal(String email){
        this.email = email;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Paid "+ amount + " using PayPal " + email)  ;
    }
}
