package Thread_Head_First;

public class ThreadTester {
    public static void main(String[] args) throws InterruptedException {
        Runnable threadJob = new MyRunnable();

        Thread myThread = new Thread(threadJob);

        myThread.start();

//        myThread.join();


        System.out.println("Back in main");
    }
}
