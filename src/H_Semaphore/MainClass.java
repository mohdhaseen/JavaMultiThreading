package H_Semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {

	public static void main(String[] args) {
	Downloader downloader = new Downloader();
	ExecutorService executorService = Executors.newCachedThreadPool();
	for (int i = 0; i < 15; i++) {
		executorService.execute(new Runnable() {
			
			@Override
			public void run() {
				downloader.download();
			}
		});
	}
	}
	
}
