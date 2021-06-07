package F_ProducerConsumer;

public class MainClass {

	public static void main(String[] args) {
		PC pc = new PC();
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				pc.produce();

			}
		});
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				pc.consume();

			}
		});
		
		thread1.start();
		thread2.start();
		
	}

}
