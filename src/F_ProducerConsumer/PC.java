package F_ProducerConsumer;

import java.util.ArrayList;
import java.util.List;

public class PC {
	private List<Integer> list = new ArrayList<>();
	private int value = 0;
	private final Object lock = new Object();

	public void produce() {
		synchronized (lock) {
			while (true) {
				try {

					if (list.size() == 5) {
						System.out.println("waiting to consume");
						lock.wait();
					} else {
						System.out.println("adding value: " + value);
						list.add(value++);
						lock.notify();
					}

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public void consume() {
		synchronized (lock) {
			while (true) {
				try {
					if (list.size() == 0) {
						System.out.println("waiting to consume");
						lock.wait();
					} else {
						Thread.sleep(1000);
						System.out.println("removing value: " + list.remove(--value));
						lock.notify();
						/*
						 * the written after notify is executed first so loop is continued 
						 */
					}

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
