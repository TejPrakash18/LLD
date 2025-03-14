package concurrency;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Inner thread " + i);
        }
    }
    @Override
    public synchronized void start() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Inner thread in the start methode " + i);
        }
    }

}
