package Theory;

public class ThreadRelatedTerms {
	/*
	 * 1. Mutex: Kind of semaphore with limit 1
	 * 2. Monitor:A monitor is mechanism/ synchronization construct to control concurrent access to an object.
	 * example:
	 * public void a()
		{
    synchronized(someObject) {
        // do something // this is critical section
    						}
		}
	 * 3.Critical Section: code that can cause data inconsistency.
	 * 4. Race Condition:A race condition is a special condition that may occur 
	 * 	inside a critical section, to avoid race condition we synchronize the block.
	 * 5.Deadlock: When two threads are waiting for each other to free the resource
	 * 6.Livelock: When two threads are too busy in responding each other and no progress is takes place.
	 * 7.Starvation : when a thread keep waiting for a long time because of low priority and other threads acquire the lock
	 */

}
