package GReentrantLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/*
 * A reentrant mutual exclusion Lock with the same basic behavior and semantics as the implicit monitor lock
 * accessed using synchronized methods and statements, but with extended capabilities.
A ReentrantLock is owned by the thread last successfully locking, but not yet unlocking it.
* There are three scenarios
* A thread invoking lock will return, successfully acquiring the lock, when the lock is not owned
* by another thread. The method will return immediately if the current thread already owns the lock.
* This can be checked using methods isHeldByCurrentThread(), and getHoldCount().
 */
public class ExampleReentrantLock {
    ReentrantLock lock = new ReentrantLock();

    public void produce() throws InterruptedException {
        lock.lock();
        System.out.println(Thread.currentThread().getName()
                + " isHeldByCurrentThread:"
                + lock.isHeldByCurrentThread() + " hold count: " + lock.getHoldCount());
        Thread.sleep(2000);
        if (Thread.currentThread().getName().contains("0") && lock.getHoldCount() == 1)
            produce();
        lock.unlock();
        System.out.println("lock released");
    }

}
