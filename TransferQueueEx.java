package MultiThreading;
import java.util.concurrent.*;
/* 
 * program of  TransferQueue
 */
class TransferQueueEx {
	public static void main(String[] args) throws Exception
	{
		TransferQueue<Integer> queue = new LinkedTransferQueue<Integer>();
		for (int i = 10; i <= 14; i++)
			queue.add(i);
		// Add the element using offer() method
		System.out.println("adding 15 "+ queue.offer(15, 5, TimeUnit.SECONDS));
		for (int i = 16; i <= 20; i++)
			queue.put(i);
		System.out.println("The elements in the queue are:");
		for (Integer i : queue)
			System.out.print(i + " ");

		System.out.println();

		// create another queue to transfer method
		TransferQueue<String> g = new LinkedTransferQueue<String>();

		new Thread(new Runnable() {
			public void run()
			{
				try {
					System.out.println("Transferring" + " an element");                     
					g.transfer(" Pravin " + " aditya");
					System.out.println("Element " + "transfer is complete");
				}
				catch (InterruptedException e1) {
					System.out.println(e1);
				}
				catch (NullPointerException e2) {
					System.out.println(e2);
				}
			}
		})
			.start();

		try {

			// Get the transferred element
			System.out.println("Devendra" + g.take());
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
