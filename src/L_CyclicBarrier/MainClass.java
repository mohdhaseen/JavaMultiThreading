package L_CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MainClass {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("action executed");
            }
        });
        Thread t1 = new Thread(new SampleRunnable(cyclicBarrier));
        Thread t2 = new Thread(new SampleRunnable1(cyclicBarrier));
        t1.start();
        t2.start();

        try {
            cyclicBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.println("All previous tasks completed");

    }

}
