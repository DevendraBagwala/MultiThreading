package MultiThreading;
/* 
 * This class for interrupt method in MUltithreading
 */
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
class InterruptThreadEx extends Thread{  
	
	static Logger logger;
    static ConsoleHandler handler;

    static {

        logger = Logger.getAnonymousLogger();
        logger.setLevel(Level.FINE);
        handler = new ConsoleHandler();
        handler.setLevel(Level.FINE);
        logger.addHandler(handler);

    }
		
public void run(){  
		try{  
			Thread.sleep(1000);  
	System.out.println("task");  
		}catch(InterruptedException e){  
			logger.log(Level.FINE, e.getMessage());//throw new RuntimeException("Thread interrupted..."+e.getMessage());  
	}  
  
}  
  
public static void main(String args[]){  
	InterruptThreadEx t1=new InterruptThreadEx();  
			t1.start();  
			try{  
				t1.interrupt();  
			}catch(Exception e){
				logger.log(Level.FINE, e.getMessage());	//System.out.println("Exception handled "+e.getMessage());
			}  
  
	}  
}  



