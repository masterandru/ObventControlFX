package sample;

public class LazySingleton {
    private static LazySingleton singleInstance;

    /*static {
        if (singleInstance == null) {
            singleInstance = new LazySingleton();
        }
    }*/


    private LazySingleton() {
    }

    public static void doSomething(){
        System.out.println("doSomething() - IT WORKS ");
    }

    public static synchronized LazySingleton getInstance() {
        if (singleInstance == null) {
            singleInstance = new LazySingleton();
        }
        return singleInstance;
    }



}