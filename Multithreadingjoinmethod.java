package MultiThreading;
/*     
 * This class has a method that perform Multi-threading jion method
 */
class Multithreadingjoinmethod extends Thread{  
	  public void run(){  
	   System.out.println("running...");  
	  }  
	 public static void main(String args[]){  
	  Multithreadingjoinmethod t1=new  Multithreadingjoinmethod();  
	  Multithreadingjoinmethod t2=new  Multithreadingjoinmethod();  
	  System.out.println("Name of t1:"+t1.getName());  
	  System.out.println("Name of t2:"+t2.getName());  
	  System.out.println("id of t1:"+t1.getId());  
	  
	  t1.start();  
	  t2.start();  
	  
	  t1.setName("Dev Divergent");  
	  System.out.println("After changing name of t1:"+t1.getName());  
	 }  
	}  