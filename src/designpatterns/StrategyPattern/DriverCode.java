package designpatterns.StrategyPattern;

public class DriverCode {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setStrategy(new PaymentByCreditCard("1234-5678-9878-5432"));
        paymentContext.payAmount(500);

        paymentContext.setStrategy(new PaymentByPayPal("tej22upa.dhyay@gmail.com"));
        paymentContext.payAmount(1000);

        paymentContext.setStrategy(new GooglePay("8171488909"));
        paymentContext.payAmount(1500);
    }
}
