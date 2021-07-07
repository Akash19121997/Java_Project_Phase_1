import java.io.File;
public class SearchFile {
public void search(String name) {
	File files[] =new File("C:\\Users\\akash\\Documents\\demofiles").listFiles();
	int flag=0;
	for(File f: files) {
		if(f.getName().equals(name+".txt")) {
			System.out.println("File is present");
			flag=1;
			break;
		}
	}
	if(flag==0)
		System.out.println("File Not Found");
}
}
