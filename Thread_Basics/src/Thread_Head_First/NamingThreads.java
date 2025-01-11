package Thread_Head_First;


public class NamingThreads implements Runnable {
    public static void main(String[] args) {
        // Create a single Runnable instance
        NamingThreads runner = new NamingThreads();

        // Create two threads using the same Runnable instance
        Thread alpha = new Thread(runner);
        Thread beta = new Thread(runner);

        // Name the threads
        alpha.setName("Alpha thread");
        beta.setName("Beta thread");

        // Start the threads
        alpha.start();
        beta.start();
    }

    @Override
    public void run() {
        // Loop to simulate thread activity
        for (int i = 0; i < 22; i++) {
            // Get the current thread's name
            String threadName = Thread.currentThread().getName();
            // Print the thread's name and its current state
            System.out.println(threadName + " is running");
        }
    }
}
