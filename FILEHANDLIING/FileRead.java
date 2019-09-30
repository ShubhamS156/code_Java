mport java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead{
	public static void main(String[] args) {
		try{
		File obj1=new File("/home/shubhs/Desktop/github/code_Java/fileDir/a.txt");
		Scanner reader=new Scanner(obj1);
		while(reader.hasNextLine()){
			String data= reader.nextLine();
			System.out.println(data);
		}
		reader.close();

	
	}
	catch(FileNotFoundException e){
		System.out.println("Error aaya");
		e.printStackTrace();
	}
	}
}