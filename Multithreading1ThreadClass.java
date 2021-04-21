package MultiThreading;
/* 
 * This class has a method that perform Multi-threading 
 */
public class Multithreading1ThreadClass {

	public static void main(String[] args) {
		//using the thread class
		ThreadTest threadTest = new ThreadTest();
		threadTest.start();
		
		Thread runnableTest = new Thread(new RunnableTest());
		System.out.println("Thread Name:" + runnableTest.getName());
		runnableTest.start();
		
		System.out.println("Done successful");
		
	}
}

class ThreadTest extends Thread {
	
	public void run() {
		System.out.println("Thread Name:" + this.getName());
		
	}
	
}

class RunnableTest implements Runnable {
	
	public  void run() {
		System.out.println("Inside Runnable run()");
		
	}
}