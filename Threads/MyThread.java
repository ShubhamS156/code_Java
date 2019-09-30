import java.io.*;

 class MyThreading extends Thread{
	public void run(){
		for(int i=0;i<=4;i++){
		System.out.println(Thread.currentThread().getId()+"Thread is running..."); //Thread.currentThread().getId() gives id of the running thread
	}
	try{
		Thread.sleep(1000);
	}
	catch(InterruptedException e){
		e.printStackTrace();
	}
}

	}
public class MyThread{

	public static void main(String[] args) {
	
		MyThreading obj=new MyThreading();
		obj.start();
		MyThreading obj1=new MyThreading();
		obj1.start();
	
}
}



//thread created using extending class ;
