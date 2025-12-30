package designpatterns.state;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        for (int i = 0; i < 6; i++) {
            context.changeLight();
        }
    }
}
