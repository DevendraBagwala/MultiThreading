package MultiThreading;

public class MainThread {
	   public static void main(String args[]) {
	      Thread t = Thread.currentThread();
	      System.out.println("Main thread: " + t);
	      t.setName("current");
	      System.out.println("Current thread: " + t);
	      try {
	         for (int i = 1; i <= 3; i++) {
	            System.out.println(i);
	            Thread.sleep(1000);
	         }
	      } catch (InterruptedException e) {
	         System.out.println("Main thread is interrupted");
	      }
	      System.out.println("Exiting the Main thread");
	   }
	}