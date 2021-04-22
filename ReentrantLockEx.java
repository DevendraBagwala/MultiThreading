package MultiThreading;
import java.util.concurrent.locks.*;
import java.util.concurrent.locks.ReentrantLock;
public class ReentrantLockEx {

	private static ReentrantLockEx rl;
    private static int count = 0;

    public static void incrementCount() {
        rl.lock();

        try {
            count++;
        } finally {
            rl.unlock();
        }
    }

    private void unlock() {
		// TODO Auto-generated method stub
		
	}

	private void lock() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) throws InterruptedException {

        rl = new ReentrantLockEx();

        Thread thread1 = new Thread(() -> {
            for(int i = 1; i <= 1000000; i++) {
                incrementCount();
            }
        });
        thread1.start();
        Thread.sleep(1);
        System.out.println(count);

        Thread thread2 = new Thread(() -> {
            for(int i = 1; i <=1000000; i++) {
                incrementCount();
            }
        });
        thread2.start();
        Thread.sleep(1);
        System.out.println(count);

    }
}
