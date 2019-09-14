import java.io.FileWriter;
import java.io.IOException;

public class FileWrite{
	public static void main(String[] args) {
		try{
		FileWriter obj3=new FileWriter("/home/shubhs/Desktop/github/code_Java/fileDir/a.txt");
		obj3.write("learning file handling in java...majani life");
		obj3.close();
		System.out.println("Successfuly wrote to file ");
}
catch(IOException e){
	System.out.println("Error occured");
	e.printStackTrace();
	}
}
}