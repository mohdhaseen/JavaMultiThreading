package C_Synchronize;

public class MainClass {

	public static void test() {
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				Processor.process();
			}
		});
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				Processor.process1();
			}
		});
		Thread thread3 = new Thread(new Runnable() {

			@Override
			public void run() {
				Processor.process();
			}
		});
		Thread thread4 = new Thread(new Runnable() {

			@Override
			public void run() {
				Processor.process1();
			}
		});
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

	public static void main(String[] args) {
		test();
	}

}
