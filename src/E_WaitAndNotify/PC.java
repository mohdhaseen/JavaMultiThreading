package E_WaitAndNotify;

import java.util.Scanner;

public class PC {
    synchronized void produce() {
        System.out.println("producer is waiting...");
        try {
            /*
             * wait must be called inside synchronized block otherwise it thorws
             * java.lang.IllegalMonitorStateException at run time
             */
            wait();
            System.out.println("producer is notified");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void consume() {
        System.out.println("Enter y to notify");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        if (line.equals("y"))
            notify();
    }
}
