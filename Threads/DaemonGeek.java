 
public class DaemonGeek extends Thread 
{ 
	public DaemonGeek(String name){ 
		super(name); 
	} 

	public void run() 
	{ 
		
		if(Thread.currentThread().isDaemon()) 
		{ 
			System.out.println(getName() + " is Daemon thread"); 
		} 
		
		else
		{ 
			System.out.println(getName() + " is User thread"); 
		} 

		try{
			Thread.sleep(1000);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	} 
	
	public static void main(String[] args) 
	{ 
	
		DaemonGeek t1 = new DaemonGeek("t1"); 
		DaemonGeek t2 = new DaemonGeek("t2"); 
		 
	
 
		t1.setDaemon(true); 
		t2.setDaemon(true);
			
	
		t1.start(); 
		t2.start(); 

		
			 
	} 
} 
