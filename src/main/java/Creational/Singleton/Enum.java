package Creational.Singleton;

/**
 * Java ensures that only one instance of an enum value is created, even in a multi-threaded environment.
 * The Enum Singleton pattern is the most robust and concise way to implement a singleton in Java.
 */
public enum Enum {
    INSTANCE;
    public void getInstance() {}
}
