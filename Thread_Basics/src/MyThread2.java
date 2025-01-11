public class MyThread2 extends Thread {

    Thread t1;

    public MyThread2(Thread t1) {
        this.t1 = t1;
    }

    @Override
    public void run() {
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Child thread 2");
        }
    }

    public void setT1(Thread t1) {
        this.t1 = t1;
    }
}
