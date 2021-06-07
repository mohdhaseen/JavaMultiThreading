package L_CyclicBarrier;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/*
A synchronization aid that allows a set of threads to all wait for each other to reach a
common barrier point. CyclicBarriers are useful in programs involving a fixed sized party of
threads that must occasionally wait for each other. The barrier is called cyclic because
it can be re-used after the waiting threads are released.
The other import difference is we can specify an action/task after all threads are executed
 */
public class SampleRunnable implements Runnable {
    private CyclicBarrier cyclicBarrier;

    public SampleRunnable(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " running");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " completed");
            cyclicBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
