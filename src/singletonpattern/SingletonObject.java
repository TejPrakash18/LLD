package singletonpattern;

public class SingletonObject {

    private static SingletonObject instance;

    private SingletonObject(){}

    public static synchronized SingletonObject getInstance(){
        if(instance == null){
            instance = new SingletonObject();
        }
        return instance;
    }


    public static void main(String[] args) {
        SingletonObject singletonObject = SingletonObject.getInstance();
        SingletonObject singletonObject1 = SingletonObject.getInstance();
        SingletonObject singletonObject2 = SingletonObject.getInstance();

        System.out.println(singletonObject1.hashCode());
        System.out.println(singletonObject2.hashCode());

        System.out.println(singletonObject.hashCode());

//        if (singletonObject1 == singletonObject){
//            System.out.println("hash code is same!, that means this is singleton class ");
//        }
    }
}
