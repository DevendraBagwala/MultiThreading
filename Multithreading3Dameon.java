package MultiThreading;
/* 
 * This class has a method that perform Multi-threading dameon thread
 */
public class Multithreading3Dameon extends Thread {

	public static void main(String[] args) {
		System.out.println("Main Thread Entry");
		
		Multithreading3Dameon t = new Multithreading3Dameon();
		t.setDaemon(true);

		
		t.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException x) {
			
		}
		System.out.println("Main Method Exist");
	}
	
	public void run() {
		System.out.println("run method entry");
		
		try {
			System.out.println("In run  Currentthread is" + Thread.currentThread());
			while(true) {
				try {
					Thread .sleep(1000);
				} catch (InterruptedException x) {
					
				}
				System.out.println("In run method " + Thread.currentThread());
				
			}
		}finally {
				System.out.println("run Method Exit");
		}
			
   }
}

