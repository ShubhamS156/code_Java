import java.io.*;
import SeDe.ToSerialize4;

public class DeSerialize1{
	public static void main(String[] args) throws ClassNotFoundException{
		ToSerialize4 obj=null;
				String fileName="objVal.txt";

	  ToSerialize4 obj2=null;
	  try{
	  	FileInputStream file=new FileInputStream(fileName);
	  	ObjectInputStream in=new ObjectInputStream(file);
	  	obj2=(ToSerialize4)in.readObject();
	  	in.close();
	  	file.close();
	  	System.out.println("object deserialized");
	  	System.out.println("a= "+obj2.a);
	  	System.out.println("b= "+obj2.b);

	  }
	  catch(IOException ex){
	  	System.out.println("IOException is caught");
	  }
	  catch(ClassNotFoundException ex){
	  	System.out.println("Class Not Found Exception");
	  }


	}
}

//maybe class signature  is different.
