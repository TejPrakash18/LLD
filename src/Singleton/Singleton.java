package Singleton;


enum SingletonInstance{
    INSTANCE;
}

public class Singleton {

//    private static Singleton instance;
//
//    private Singleton(){
//
//    }
//    public static  Singleton getInstance(){
//        if (instance == null){
//            synchronized (Singleton.class){
//                if (instance == null){
//                    instance = new Singleton();
//                }
//            }
//
//        }
//        return instance;
//    }
    public static void main(String[] args) {
//        Singleton singleton = Singleton.getInstance();
        SingletonInstance singleton = SingletonInstance.INSTANCE;
        System.out.println("Singleton " + singleton);

    }
}
