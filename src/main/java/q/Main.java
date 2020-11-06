package q;
import java.lang.ThreadGroup;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable r  = new MyThread();
        ThreadGroup mainGroup = new ThreadGroup("main group");
        Thread myThread1 = new Thread(mainGroup, r, "myThread1");
        Thread myThread2 = new Thread(mainGroup, r, "myThread2");
        Thread myThread3 = new Thread(mainGroup, r, "myThread3");
        Thread myThread4 = new Thread(mainGroup, r, "myThread4");
        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        try {
            Thread.sleep(15000);
        } catch (InterruptedException err) {
            System.out.println(err.getMessage());
        }
         mainGroup.interrupt();
    }
}
