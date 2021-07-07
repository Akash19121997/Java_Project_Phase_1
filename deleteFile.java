import java.io.*;
public class deleteFile {
	public void delete(String name) {
		int flag=0;
		File files[] =new File("C:\\Users\\akash\\Documents\\demofiles").listFiles();
		for(File f : files) {
			if(f.getName().equals(name+".txt")) {
				f.delete();
				System.out.println("File successfully deleted");
				flag=1;
				break;
			}	
		}
		if(flag==0)
			System.out.println("File Not Found");
	}
}
