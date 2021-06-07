package GReentrantLock;


public class MainClassForPC {

	public static void main(String[] args) {
		PCUsingCondition pc = new PCUsingCondition();
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
		try {
			thread1.join();
			/*
			 * if you don't call join, output might be as below:
			 * 	inside consume method
				inside produce method
			 */
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
