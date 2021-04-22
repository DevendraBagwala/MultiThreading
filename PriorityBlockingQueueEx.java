package MultiThreading;
/* 
 * program to check PriorityBlockingQueue
 */
import java.util.concurrent.PriorityBlockingQueue;
import java.util.*;

public class PriorityBlockingQueueEx  {
	public static void main(String[] args)
	{
		int capacityOfQueue = 5;
		PriorityBlockingQueue<String> names = new PriorityBlockingQueue<String>(capacityOfQueue);
		names.add("gorav");
		names.add("Devendra");
		names.add("Aman");
		names.add("Chetan");
		names.add("Piyush");
		Iterator iteratorVals = names.iterator();

		System.out.println("The Names are:");

		while (iteratorVals.hasNext()) {
			System.out.println(iteratorVals.next());
		}
	}
}
