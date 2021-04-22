package MultiThreading;

import java.util.concurrent.ConcurrentLinkedQueue;
/* 
 * This class has a method concurrentLinkedQueue for efficient queue
 */
public class ConcurrentLinkedQueueEx {
    public static void main(String[] args) {

        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();

        queue.add(5);
        queue.add(7);
        queue.add(8);
        queue.add(11);
        System.out.println(queue);
        System.out.println(queue.remove(8));
        System.out.println(queue);
        System.out.println(queue.size());

    }
}