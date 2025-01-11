

public class Main {
    public static void main(String[] args) throws InterruptedException {


        MyThread myThread1 = new MyThread();

        Thread.sleep(2000);
        myThread1.interrupt();

        System.out.println("Hello from Main");
        myThread1.start();


    }

}