package proxydesignpattern;

public class RealSubject implements subject {
    @Override
    public void attendance() {
        System.out.println("I am present....!");
    }
}
