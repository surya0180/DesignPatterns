package Creational.Singleton.Examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolManager {

    // The single instance of the class (eager initialization)
    private static final ThreadPoolManager instance = new ThreadPoolManager();

    // The thread pool (ExecutorService)
    private ExecutorService executorService;

    // Private constructor to prevent instantiation
    private ThreadPoolManager() {
        // Initialize the thread pool with a fixed number of threads (e.g., 10)
        executorService = Executors.newFixedThreadPool(10);
    }

    // Public method to provide access to the singleton instance
    public static ThreadPoolManager getInstance() {
        return instance;
    }

    // Method to submit a task to the thread pool
    public void executeTask(Runnable task) {
        executorService.submit(task);
    }

    // Gracefully shut down the thread pool
    public void shutdown() {
        executorService.shutdown();
    }

    // Method to check if the thread pool is terminated
    public boolean isTerminated() {
        return executorService.isTerminated();
    }
}
