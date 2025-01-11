package Thread_Head_First;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        go();
    }

    public void go() {
        doMore();
    }


    public void doMore() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello");
    }
}
