public class Main {
    public static void printName(String name){
        System.out.println("My name is "+ name);
    }
    public static void main(String[] args) {
        printName("Tej");
        System.out.println("Hello, LLD..!");
        System.out.println("This is the series of LLD...");
        Printing.printNumber(10);

        int x = 4;
//        System.out.println("x post decrement "+ x--);
        int y = x--;
        System.out.println("y is "+ y);
        System.out.println("x is "+ x);
    }
}

class Printing{
    public static void printNumber(int number){
        for (int i = 1; i <=  number ; i++) {
            System.out.println(i);
        }
    }
}