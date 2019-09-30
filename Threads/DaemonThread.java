// Java program to demonstrate the usage of 
// setDaemon() and isDaemon() method. 
 
class Status extends Thread{
public void getStatus(){
	if(Thread.currentThread().isDaemon()) 
		{ 
			System.out.println(getName() + " is Daemon thread"); 
		} 
		
		else
		{ 
			System.out.println(getName() + " is User thread"); 
		}
}

}
 class Daemon extends Thread 

{ 
	Status st1;
	public Daemon(String name,Status status1){ 
		super(name); 
		status1=st1;
	} 

	public void run() 
	{ 
		synchronized(st1){
		st1.getStatus();
		 
	} 
	}
}

public class DaemonThread{

	public static void main(String[] args) 
	{ 
		Status stat1=new Status();

		Daemon t1 = new Daemon("t1",stat1); 
		 
		Daemon t3 = new Daemon("t3",stat1); 
	
		// Setting user thread t1 to Daemon 
		t1.setDaemon(true); 
		t3.setDaemon(true);
		// starting first 2 threads 
		t1.start();	 
		t3.start();		 
	} 
} 

// serious doubtss