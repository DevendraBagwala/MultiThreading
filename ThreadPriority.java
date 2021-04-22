package MultiThreading;

/**
 * changing the priority of thread and test thread priority
 */

public class ThreadPriority {

    public static void main(String[] args) {

        Runnable runnable1 = () -> {
            for(int i = 1; i <= 10; i++) {
                if(i > 5)
                    Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
                System.out.println(Thread.currentThread().getName() + " --- " + i + " --- Thread Priority : " + Thread.currentThread().getPriority());
            }
        };

        Runnable runnable2 = () -> {
            Thread.currentThread().setPriority(3);
            for(int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + " --- " + i + " --- Thread Priority : " + Thread.currentThread().getPriority());
            }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

    }
}