public class MyThread extends Thread {


    @Override
    public void run() {
        System.out.println("Thread 1 Start");
        try {
           Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Men uyg'ondim!");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 1");
        }

    }
}
