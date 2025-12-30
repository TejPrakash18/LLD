package designpatterns.cof;

public abstract class AbstractCashHandler implements Handler {
    protected Handler nextHandler;

    @Override
    public void setNext(Handler next) {
        this.nextHandler = next;
    }

    protected int forward(int remaining) {
        if (nextHandler != null) {
            return nextHandler.handle(remaining);
        }
        return remaining;
    }
}
