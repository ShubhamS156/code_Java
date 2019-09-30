import java.io.*;
import SeDe.ToSerialize4;
public class Serialize1{
public static void main(String[] args) {
	ToSerialize4 obj1=new ToSerialize4();
	String fileName="objVal.txt";

	obj1.setMethod("Sharma","Shubham");

	try{
	 FileOutputStream file=new FileOutputStream(fileName);
	 ObjectOutputStream out=new ObjectOutputStream(file);

	 out.writeObject(obj1);
	 out.close();
	 file.close();
	 System.out.println("Object serialized");
	  }
	  catch(IOException ex){
	  	System.out.println("IOException is caught");
	  }
}
}
