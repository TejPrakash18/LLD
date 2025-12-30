package designpatterns.cof;

public class ValidationHandler extends AbstractCashHandler{
    @Override
    public int handle(int amount) {
        if(amount !=0){
            throw new RuntimeException("Transaction failed");
        }
        System.out.println("Transaction Successful");
        return 0;
    }
}
