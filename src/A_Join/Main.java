package A_Join;

public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(new SampleRunnable());
        Thread t2 = new Thread(new SampleRunnable());
        t1.start();
        t2.start();
        try {
            // Both the threads are running concurrently
            t1.join();// it waits for t1 to die
            t2.join();// it waits for t2 to die
            System.out.println("threads execution completed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
