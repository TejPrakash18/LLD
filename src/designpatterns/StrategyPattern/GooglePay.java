package StrategyPattern;

public class GooglePay implements Strategy{
    private final String phoneNumber;

    GooglePay(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount +" using google pay " + phoneNumber);
    }
}
