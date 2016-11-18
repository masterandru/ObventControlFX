package sample;
//Advanced java
//        6 / 113
//        1.4.1    Singleton
//        Singleton is one of the oldest and controversial patterns in software developer’s community.  Basically, the main idea of it is to
//        ensure that only one single instance of the class could be created at any given time.  Being so simple however, singleton raised
//        a lot of the discussions about how to make it right and, in particular, thread-safe. Here is how a naive version of singleton class
//may look like:

public class LazySingleton {
    private static LazySingleton instance;


    private LazySingleton() {
    }


    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}