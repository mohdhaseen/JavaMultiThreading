package GReentrantLock;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
/*
Condition is used with ReentrantLock.
Instances of this class can be constructed only using method ReentrantLock.newCondition().
This class supports the same basic semantics and styles of usage as the Object monitor methods.
 Methods may be invoked only when holding the ReentrantLock associated with this Condition.
 Failure to comply results in IllegalMonitorStateException.
 We can have multiple wait-sets per object.
 See ArrayBlockingQueue for other implementation
 */
public class PCUsingCondition {
    final ReentrantLock lock = new ReentrantLock();
    final Condition condition = lock.newCondition();

    void produce() {
        lock.lock();
        System.out.println("producer is waiting...");
        try {
            condition.await();
            System.out.println("producer is notified");
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    void consume() {
        lock.lock();
        System.out.println("Enter y to notify");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        if (line.equals("y"))
            condition.signal();
        System.out.println("Hold count =" + lock.getHoldCount());
        lock.unlock();
    }


}
