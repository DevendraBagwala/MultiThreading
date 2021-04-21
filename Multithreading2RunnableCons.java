package MultiThreading;
import java.util.concurrent.Executor;
/*  
 * This class has a method that perform Multi-threading
 */
public class Multithreading2RunnableCons {

	public static void main(String[] args) {
	
		RunnableTest2 runnableTest2 = new RunnableTest2();
		Thread runnableThread = new Thread(runnableTest2);
		runnableThread.start();
		
		Thread runnableThread2 = new Thread(runnableTest2);
		runnableThread2.start();
		
		ThreadPerTaskExecutor executor = new ThreadPerTaskExecutor();
		executor.execute(runnableTest2);		
	}
}

class RunnableTest2 implements Runnable {
	
	public void run() {
		System.out.println("run method called");
		
	}
}

class ThreadPerTaskExecutor implements Executor{
	public void execute(Runnable r) {
		new Thread(r).start();
	}
}
