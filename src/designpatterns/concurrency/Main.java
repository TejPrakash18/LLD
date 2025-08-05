package designpatterns.concurrency;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        myThread.run();
        myThread.start();
    }
}
