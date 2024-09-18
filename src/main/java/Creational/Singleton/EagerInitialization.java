package Creational.Singleton;

/**
 * We rely on the JVM to create the singleton instance when the class is loaded.
 * The JVM guarantees that the instance will be created before any thread access the instance variable.
 * This implementation is one of the simplest and inherently thread-safe without needing explicit synchronization.
 * But this could potentially waste resources if the singleton instance is never used by the client application
 */
public class EagerInitialization {
    private static final EagerInitialization instance = new EagerInitialization();
    private EagerInitialization() {}
    public static EagerInitialization getInstance() {
        return instance;
    }
}
