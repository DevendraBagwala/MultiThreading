package MultiThreading;
import java.util.concurrent.ArrayBlockingQueue;
/* 
 *  program of ArrayBlockingQueue
 */
public class ArrayBlockingQueuEx {

	public static void main(String[] args)
	{
		int capacity = 5;
		ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(capacity);

		queue.add(25);
		queue.add(32);
		queue.add(45);
		queue.add(12);
		System.out.println("After addding numbers queue is ");
		System.out.println(queue);

		// Print head of queue using peek() method
		System.out.println("Head of queue " + queue.peek());
	}
}
