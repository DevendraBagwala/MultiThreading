package MultiThreading;
/*            
 * This class has a method atomic-variable to perform MUltithreading operations
 */
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariableEx {

	public static void main(String[] args) throws InterruptedException
    {

        value c = new value();

        Thread first = new Thread(c, "First");
        Thread second = new Thread(c, "Second");

        first.start();
        second.start();

        // main thread will wait for both threads to complete execution
        first.join();
        second.join();

        System.out.println(c.count);
    }
}

class value extends Thread {

    AtomicInteger count;  	//Atomic Variable 

    value()
    {
        count = new AtomicInteger();
    }

    public void run()
    {

        int num = 10;

        for (int i = 0; i < num; i++) {
            count.addAndGet(1);
        }
    }
}
