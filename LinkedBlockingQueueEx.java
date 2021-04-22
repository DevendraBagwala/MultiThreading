package MultiThreading;
import java.util.concurrent.LinkedBlockingQueue;
/* 
 *  Program  of LinkedBlockingQueue
 */
public class LinkedBlockingQueueEx {

	public static void main(String[] args)
	{
	
		int capacityOfQueue = 7;
		LinkedBlockingQueue<String> linkedQueue = new LinkedBlockingQueue<String>(capacityOfQueue);
		linkedQueue.add("Aditya");
		linkedQueue.add("Devendra");
		linkedQueue.add("Jayant");
		linkedQueue.add("Pravin");
		String head = linkedQueue.peek();
		System.out.println("Queue is " + linkedQueue);

		System.out.println("Head of Queue is " + head);
		linkedQueue.remove();
		head = linkedQueue.peek();
		System.out.println("\nRemoving one element from Queue\n");
		System.out.println("Queue is " + linkedQueue);

		// print head of queue
		System.out.println("Head of Queue is " + head);
	}
}
