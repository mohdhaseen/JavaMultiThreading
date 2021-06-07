package FutureAndExecutor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainClass {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		// To get the result
		Future<String> future = executorService.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				Thread.sleep(2000);
				System.out.println("completed inside thread...");
				return "Result";
			}
		});
		try {
			Thread.sleep(1000);
			System.out.println("please wait...");
			String resultString = future.get();// wait until task completion
			System.out.println("result: " + resultString);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		FutureTask<String> futureTask = new FutureTask<>(new Runnable() {
//
//			@Override
//			public void run() {
//				try {
//					Thread.sleep(2000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//
//			}
//		}, "done");
//		
//		try {
//		//	new Thread(futureTask).start();
//			//OR
//		//	executorService.execute(futureTask);
//			//OR
//			executorService.submit(futureTask);
//			System.out.print("please wait: ");
//			String resulString = futureTask.get();
//			System.out.print("result: "+resulString);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ExecutionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		

	}

}
