package Creational.Singleton;

/**
 * This is similar to lazy initialization, but we create the getInstance method using synchronised keyword
 * so that only one thread can access it at a time. But this can decrease the performance as the other
 * threads should wait till the thread that's accessing this leaves it.
 */
public class ThreadSafe {
    private static ThreadSafe instance;
    private ThreadSafe() {}
    public static synchronized ThreadSafe getInstance() {
        if(instance == null) instance = new ThreadSafe();
        return instance;
    }
}
