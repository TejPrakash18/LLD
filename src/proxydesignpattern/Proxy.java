package proxydesignpattern;

public class Proxy implements subject{
    private RealSubject realSubject;
    @Override
    public void attendance() {
        if (realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.attendance();
    }
}
