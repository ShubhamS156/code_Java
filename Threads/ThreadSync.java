import java.util.*;
import java.io.*;

class Sender{
	public void Send(String msg){
		
		System.out.println("Sending msg: \t"+msg);
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){
			System.out.println("Thread Interrupted");
		}
		System.out.println(msg+" Sent");
	}
}

class MyThreadSender extends Thread{
	String message;
	Thread t;
	Sender snd;
	public MyThreadSender(String msg,Sender obj){
		message=msg;
		snd=obj;
		
		}
	public void run(){

		synchronized(snd){
			snd.Send(message);
		}
	}
}
public class ThreadSync{
	public static void main(String[] args) {
		Sender obj1=new Sender();
		MyThreadSender obj2=new MyThreadSender("Hello",obj1);
		MyThreadSender obj3=new  MyThreadSender("Java",obj1);

		obj2.start();
		obj3.start();

	}
}