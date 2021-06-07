package IBlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	private final BlockingQueue queue;

	Consumer(BlockingQueue q) {
		queue = q;
	}

	public void run() {
		try {
			while (true) {
				System.out.println("Taking item from queue: " + queue.take());
			}
		} catch (InterruptedException ex) {

		}
	}

}
