package K_CountDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {

    public static void main(String[] args) {
        /*
        A CountDownLatch is initialized with a given count. The await methods block
        until the current count reaches zero due to invocations of the countDown() method,
         */
        CountDownLatch countDownLatch = new CountDownLatch(3);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(new SampleRunnable(countDownLatch));
        executorService.execute(new SampleRunnable(countDownLatch));
        executorService.execute(new SampleRunnable1(countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All previous tasks completed");

    }

}
