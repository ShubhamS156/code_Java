import java.io.*;
import java.io.FileWriter;

class ToSerialize1 implements java.io.Serializable{
	public int a;
	public String b;

	public void setMethod(int x,String y){
		a=x;
		b=y;
	}
}

public class SerialzeAndDeSerialize1{
public static void main(String[] args) {
	ToSerialize1 obj1=new ToSerialize1();
	String fileName="sederialize1.txt";

	obj1.setMethod(7,"Shubham");

	try{
	 File file1=new File("/home/shubhs/Desktop/github/code_Java/SerializationAndMore/sederialize1.txt");

	 ObjectOutputStream out=new ObjectOutputStream(file1);

	 out.writeObject(obj1);
	 out.close();
	 file1.close();
	 System.out.println("Object serialized");
	  }

	  catch(IOException ex){
	  	System.out.println("IOException is caught");
	  }


}
}