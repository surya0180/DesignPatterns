package Creational.Singleton;

/**
 * This uses a static inner helper class to hold the singleton instance.
 * The inner class is not loaded into memory until it's referenced for
 * the first time in the getInstance() method.
 */
public class BillPugh {
    private BillPugh() {}
    private static class Helper {
        private static final BillPugh instance = new BillPugh();
    }
    public static BillPugh getInstance() {
        return Helper.instance;
    }
}
