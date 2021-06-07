package H_Semaphore;

import java.util.concurrent.Semaphore;
/*
 * Mutex implementation using semaphore is using semaphore with 1 limit. means it allows just one thread to enter critical section at a time
 */
public class Downloader {
	Semaphore semaphore= new Semaphore(5);
	public void download() {
		try {
			semaphore.acquire();
			Thread.sleep(10000);
			System.out.println("downloading...");
			semaphore.release();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
