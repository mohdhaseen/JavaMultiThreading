package M_ThreadLocal;

import java.util.concurrent.atomic.AtomicInteger;

public class SampleRunnable implements Runnable {
    /*
    These variables differ from their normal counterparts in that each thread that accesses one
    (via its get or set method) has its own, independently initialized copy of the variable.
    ThreadLocal instances are typically private static fields in classes that wish to associate state
    with a thread (e.g., a user ID or Transaction ID).

     */
    private static final AtomicInteger nextId = new AtomicInteger(0);

    private static final ThreadLocal<Integer> threadLocal =
            new ThreadLocal<Integer>() {
                @Override protected Integer initialValue() {
                    return nextId.getAndIncrement();
                }
            };

    @Override
    public void run() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }

        System.out.println(Thread.currentThread().getName() + ":" + threadLocal.get());
    }
}
