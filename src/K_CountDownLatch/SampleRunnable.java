package K_CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class SampleRunnable implements Runnable {
    private CountDownLatch countDownLatch;

    public SampleRunnable(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " completed");
            countDownLatch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
