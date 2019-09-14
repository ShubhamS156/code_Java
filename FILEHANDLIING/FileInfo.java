import java.io.File;
import java.io.IOException;
public class FileInfo{
	public static void main(String[] args) {
		File obj2=new File("/home/shubhs/Desktop/github/code_Java/fileDir/a.txt");
		if(obj2.exists()){
			System.out.println("NameOfFile: "+obj2.getName());
			System.out.println("Readable: "+obj2.canRead());
			System.out.println("Writable: "+obj2.canWrite());
			System.out.println("PATH: "+obj2.getAbsolutePath());
			System.out.println("Length: "+obj2.length());
			System.out.println("List: "+obj2.list());
		}

		else{
			System.out.println("File Does Not Exists");
		}
	}
}