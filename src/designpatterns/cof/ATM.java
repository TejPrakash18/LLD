package designpatterns.cof;

public class ATM {
    public static void main(String[] args) {
        Handler handle500 = new FiveHundredHandler(5);
        Handler handle200 = new TwoHundredHandler(3);
        Handler handle100 = new HundredHandler(4);
        Handler validation = new ValidationHandler();

        //chain of creation or handle request
        handle500.setNext(handle200);
        handle200.setNext(handle100);
        handle100.setNext(validation);


        int withdrawAmount = 3850;
        System.out.println("Withdraw ₹" + withdrawAmount);
        try{
            handle500.handle(withdrawAmount);
        }catch (Exception e){
            System.out.println("Can't" +  e.getMessage());
        }

    }
}
