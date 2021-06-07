package A_Join;

public class SampleRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
	}
}
