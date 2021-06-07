package IBlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	private final BlockingQueue queue;
	private int counter = 0;

	Producer(BlockingQueue q) {
		queue = q;
	}

	public void run() {
		try {
			while (true) {
				Thread.sleep(1000);
				System.out.println("Putting item into queue: " + (++counter));
				queue.put(counter);
			}
		} catch (InterruptedException ex) {

		}
	}

}
