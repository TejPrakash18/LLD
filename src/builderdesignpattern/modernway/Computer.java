package builderdesignpattern.modernway;

public class Computer {
    private String type;
    private String model;
    private String RAM;
    private String CPU;
    private String color;
    private boolean isGraphics;

    private Computer() {}

    public static class Builder {
        Computer computer = new Computer();

        public Builder setType(String type) {
            computer.type = type;
            return this;
        }

        public Builder setModel(String model) {
            computer.model = model;
            return this;
        }

        public Builder setRAM(String RAM) {
            computer.RAM = RAM;
            return this;
        }

        public Builder setCPU(String CPU) {
            computer.CPU = CPU;
            return this;
        }

        public Builder setColor(String color) {
            computer.color = color;
            return this;
        }

        public Builder isGraphics(boolean isGraphics) {
            computer.isGraphics = isGraphics;
            return this;
        }

        public Computer build() {
            return computer;
        }
    }
    @Override
    public String toString() {
        return "Device {" +
                "Type='" + type + '\'' +
                ", Model='" + model + '\'' +
                ", RAM='" + RAM + '\'' +
                ", CPU='" + CPU + '\'' +
                ", Color='" + color + '\'' +
                ", Graphics Enabled=" + isGraphics +
                '}';
    }

}
