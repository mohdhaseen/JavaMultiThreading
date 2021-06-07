package FutureAndExecutor;

import java.util.concurrent.*;

/*
Types of scheduler
FixedThreadPool-  LinkedBlockingQueue
Cached thread pool- SynchronousQueue
single thread pool- LinkedBlockingQueue
Scheduled thread pool- DelayedWorkQueue
Custom- ArrayBlockingQueue

Rejection policy:
ThreadPoolExecutor.AbortPolicy
A handler for rejected tasks that throws a RejectedExecutionException.
ThreadPoolExecutor.CallerRunsPolicy
A handler for rejected tasks that runs the rejected task directly in the calling thread of the execute method, unless the executor has been shut down, in which case the task is discarded.
ThreadPoolExecutor.DiscardOldestPolicy
A handler for rejected tasks that discards the oldest unhandled request and then retries execute, unless the executor is shut down, in which case the task is discarded.
ThreadPoolExecutor.DiscardPolicy
A handler for rejected tasks that silently discards the rejected task.
 */
public class ExecutorServiceExplained {
    public static void main(String[] args) {

        /*// shutdonw , awaittermination,schedule
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 10; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("running...");
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        try {
            executorService.shutdown();
            executorService.awaitTermination(1, TimeUnit.DAYS);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main exited");*/
        ScheduledExecutorService service=Executors.newScheduledThreadPool(3);

        service.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("s1");
            }
        },1,2,TimeUnit.SECONDS);
    }
}
