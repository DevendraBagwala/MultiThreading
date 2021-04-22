package MultiThreading;
import java.util.concurrent.locks.ReentrantLock;  
/* 
 * program of Reentrant lock
 */
public class reentrantlock {

	public static void main(String[] args) {  
		   
        ReentrantLock lock=new ReentrantLock();  
        MyRunnable myRnbl=new MyRunnable(lock);  
        new Thread(myRnbl,"Thread-1").start();  
                    
 }  
}  
 
class MyRunnable implements Runnable{  
   
 ReentrantLock lock;  
 public MyRunnable(ReentrantLock lock) {   
        this.lock=lock;  
 }  
   

public void run(){  
          
        System.out.println(Thread.currentThread().getName()  
                     +" is Waiting to get the lock");  
          
        lock.lock();  

        System.out.println(Thread.currentThread().getName()  
                     +" has got the  lock.");  
          
        try {  
               Thread.sleep(2000);  
        } catch (InterruptedException e) {  
               e.printStackTrace();  
        }  


        System.out.println(" has queued Threads = "+lock.hasQueuedThreads());  
          
        System.out.println(Thread.currentThread().getName()  
                     +" has released the lock.");  
          
        lock.unlock();     
 } 
}
