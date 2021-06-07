package D_Interrupt;

public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(new SampleRunnable());
        t1.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("calling intrrupt");
        t1.interrupt();

    }
}
