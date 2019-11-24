 import java.io.*;

class ToSerialize implements java.io.Serializable{
	public int a;
	public String b;

	public void setMethod(int x,String y){
		a=x;
    b=y;
	}
}

public class SerialzeAndDeSerialize{
public static void main(String[] args) {
	ToSerialize obj1=new ToSerialize();
	String fileName="sederialize.txt";
	obj1.setMethod(74,"Shubham");

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
    //deserialisation

	  ToSerialize obj2=null;
	  try{
	  	FileInputStream file1=new FileInputStream(fileName);
	  	ObjectInputStream in=new ObjectInputStream(file1);
	  	obj2=(ToSerialize)in.readObject();
	  	in.close();
	  	file1.close();
	  	System.out.println("object deserialized");
	  	System.out.println("a= "+obj2.a);
	  	System.out.println("b= "+obj2.b);
	  	System.out.println("a1= "+obj1.a+" b1= "+obj1.b);
	  }
	  catch(IOException ex){
	  	System.out.println("IOException is caught");
	  }

	  catch(ClassNotFoundException ex){
	  	System.out.println("Class Not Found Exception");
	  }


}
}
//here  we serialize the state of a object to a file
//and the deserialize that state to another object of the same class
//cant we do that with the different objects of different classes. REFER: serialize1 and deserialize1(done)
