package builderdesignpattern.modernway;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder().setType("Gaming")
                .setModel("MSI")
                .setRAM("8GB")
                .setCPU("intel i5")
                .isGraphics(true)
                .setColor("Black").build();
        System.out.println(computer);
    }
}

