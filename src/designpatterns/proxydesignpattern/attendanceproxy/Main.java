package proxydesignpattern.attendanceproxy;

public class Main {
    public static void main(String[] args) {
        subject subject = new Proxy();
        subject.attendance();
    }
}
