import  java.lang.*;

public class MyThreadInterface implements Runnable{
	public void run(){
		System.out.println("Thread is running People");
	}
	public static void main(String[] args) {
		int z=5;
		Thread t=new Thread(new MyThreadInterface());
		t.start();
		
}
	}


//thread created using iterface(runnable interface) implementation;