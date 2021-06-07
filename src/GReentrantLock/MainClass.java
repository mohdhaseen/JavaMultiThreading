package GReentrantLock;

public class MainClass {

	public static void main(String[] args) {
		ExampleReentrantLock exampleReentrantLock = new ExampleReentrantLock();
		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					exampleReentrantLock.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					exampleReentrantLock.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					exampleReentrantLock.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}).start();
	}

}
