package singletonpattern;

public enum EnumSingleton {
    INSTANCE;

    public void printInstance(){
        System.out.println(EnumSingleton.INSTANCE);

    }

    public static void main(String[] args) {
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        System.out.println("object "+enumSingleton);
        enumSingleton.printInstance();
    }
}
