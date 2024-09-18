package Creational.Singleton;

/**
 * This creates a singleton instance only when its needed.
 * This is not thread safe. If multiple threads call getInstance() simultaneously
 * when instance is null, it's possible to create multiple instances.
 */
public class LazyInitialization {
    private static LazyInitialization instance;
    private LazyInitialization() {}
    public static LazyInitialization getInstance() {
        if(instance == null) {
            instance = new LazyInitialization();
        }
        return instance;
    }
}
