package sample;

/**
 * Created by andruschenko-ip on 18.11.2016.
 */
public class LazySingletonKeeper {
    public static void main(String[] args) {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        lazySingleton.doSomething();
    }
}
