package L_CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class SampleRunnable1 implements Runnable {
    private CyclicBarrier cyclicBarrier;

    public SampleRunnable1(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " running");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " completed");
            cyclicBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
