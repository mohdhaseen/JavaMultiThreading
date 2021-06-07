package D_Interrupt;

public class SampleRunnable implements Runnable {
    private boolean isRunning = true;

    @Override
    public void run() {
        while (isRunning) {
            System.out.println(Thread.currentThread().getName() + "running... ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                isRunning = false;// can't use isInterrupt() method here because once the InterruptedException
                                  // is thrown the interrupt state gets cleared, if you have not handled exception
                                    // then you can use
                                // if you want to handle the exception in main class throw exception from here
            }
        }


    }
}
