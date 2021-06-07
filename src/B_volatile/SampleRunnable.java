package B_volatile;

public class SampleRunnable implements Runnable {
    // In a multithreaded application where the threads operate on non-volatile variables,
    // each thread may copy variables from main memory into a CPU cache while working on them,
    //for performance reasons. If your computer contains more than one CPU, each thread may run
    // on a different CPU. That means, that each thread may copy the variables into the CPU cache of different CPUs.
    // It tells the compiler not to optimize the performance and read it from main memory
    // because when an object is frequently used it is optimized by compiler.

    // declaring volatile doesn't solve the consistency problem, because when multiple threads
    // perform read write operation it may cause race condition
    // You need to synchronize to make read write operations atomic other alternatives are to use atomic data type in
    // java.util.concurrent concurrent package.

    private SharedObject sharedObject;

    public SampleRunnable(SharedObject sharedClass) {
        this.sharedObject = sharedClass;
    }

    @Override
    public void run() {
        while (sharedObject.getValue() == 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());

        }

    }
}
