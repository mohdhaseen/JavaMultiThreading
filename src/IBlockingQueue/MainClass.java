package IBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*
 * A Queue that additionally supports operations that wait for the queue to 
 * become non-empty when retrieving an element, and wait for space to become 
 * available in the queue when storing an element.

A BlockingQueue does not accept null elements. Implementations throw 
NullPointerException on attempts to add, put or offer a null. A null is used as 
a sentinel value to indicate failure of poll operations.

A BlockingQueue may be capacity bounded. At any given time it may have a 
remainingCapacity beyond which no additional elements can be put without blocking.
 A BlockingQueue without any intrinsic capacity constraints always reports a remaining
  capacity of Integer.MAX_VALUE.
 */
public class MainClass {

	public static void main(String[] args) {
	BlockingQueue<Integer> blockingQueue=new ArrayBlockingQueue<Integer>(3);
		/*
		 * ExecutorService executorService = Executors.newCachedThreadPool(); for (int i
		 * = 0; i < 6; i++) { executorService.execute(new Consumer(blockingQueue)); }
		 * for (int i = 0; i < 3; i++) { executorService.execute(new
		 * Producer(blockingQueue)); }
		 */
	new Thread(new Consumer(blockingQueue)).start();
	new Thread(new Producer(blockingQueue)).start();
	}
	
}
