package C_Synchronize;

public class Processor {
	private static Object lockObject = new Object();
	private static Object lockObject1 = new Object();
	/*
	 * Class intrinsic lock synchronized public static void process() { try {
	 * System.out.println(Thread.currentThread().getName() +
	 * " processing... process"); Thread.sleep(5000); } catch (InterruptedException
	 * e) { // TODO Auto-generated catch block e.printStackTrace(); }
	 * 
	 * }
	 * 
	 * synchronized public static void process1() { try {
	 * System.out.println(Thread.currentThread().getName() +
	 * " processing... process1"); Thread.sleep(5000); } catch (InterruptedException
	 * e) { // TODO Auto-generated catch block e.printStackTrace(); } }
	 */
//Applying multiple locks so threads will executed both the methods at a time
	public static void process() {
		synchronized (lockObject) {
			try {
				System.out.println(Thread.currentThread().getName() + " processing... process");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	public static void process1() {
		synchronized (lockObject1) {
			try {
				System.out.println(Thread.currentThread().getName() + " processing... process1");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
