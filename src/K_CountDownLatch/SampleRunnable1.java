package K_CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class SampleRunnable1 implements Runnable {
    private CountDownLatch countDownLatch;

    public SampleRunnable1(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " completed");
            countDownLatch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
