package Creational.Singleton;

/**
 * This reduces the overhead on performance by making the synchronization only when the instance is created
 * for first time. We use volatile keyword to implement this. Code complexity slightly increased but this
 * decreases the overhead.
 */
public class DoubleCheckedLocking {
    private static volatile DoubleCheckedLocking instance;
    private DoubleCheckedLocking() {}
    public static DoubleCheckedLocking getInstance() {
        if(instance == null) { // This condition is not synchronised and will be called 1st time;
            synchronized (DoubleCheckedLocking.class) { // This condition is synchronised and will be called only once.
                if(instance == null) instance = new DoubleCheckedLocking();
            }
        }
        return instance;
    }
}
