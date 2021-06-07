package B_volatile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Suppose that two threads are working on SharedObj.
         * If two threads run on different processors each thread may have its own
         * local copy of sharedVariable. If one thread modifies its value the change
         *  might not reflect in the original one in the main memory instantly.
         *  This depends on the write policy of cache. Now the other thread is not
         *  aware of the modified value which leads to data inconsistency.
         */
        SharedObject sharedObject = new SharedObject();
        sharedObject.setValue(0);
        Thread t1 = new Thread(new SampleRunnable(sharedObject));
        Thread t2 = new Thread(new SampleRunnable(sharedObject));
        t1.start();
        t2.start();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n to stop");
        String input = scanner.nextLine();
        if (input.equals("n"))
            sharedObject.setValue(1);

    }

}
