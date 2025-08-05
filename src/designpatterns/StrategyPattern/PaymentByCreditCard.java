package StrategyPattern;

public class PaymentByCreditCard implements Strategy{
    private String cardNumber;

    PaymentByCreditCard(String cardNumber){
        this.cardNumber= cardNumber;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Paid "+ amount +" using credit card " + cardNumber);

    }
}
