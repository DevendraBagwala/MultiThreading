package MultiThreading;
/*    
 * Implementation of thread class by extending thread
 */

class ThreadImplementation  extends Thread{  
public void run(){  
System.out.println("thread is running...");  
}  
public static void main(String args[]){  
ThreadImplementation t1=new ThreadImplementation();  
t1.start();  
 }  
}  