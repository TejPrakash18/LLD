package designpatterns.cof;

public interface Handler {
    void setNext(Handler next);
    int handle(int amount);
}
