import java.io.File;
import java.io.IOException;
public class FileCreate{
	public static void main(String[] args) {
		try{
		File obj1=new File("/home/shubhs/Desktop/github/code_Java/fileDir/a.txt");
		if(obj1.createNewFile()){
			System.out.println("File created: "+obj1.getName());
		}	
		else{
			System.out.println("File already exists");
		}
}
		catch(IOException e){
			System.out.println("Error occured");
			e.printStackTrace();
		}



	}
}

//running this program creates a text file in fileDir folder
//running FileInfo program returns the info about file