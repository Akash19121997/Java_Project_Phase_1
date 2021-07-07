import java.io.File;
import java.util.Set;
import java.util.TreeSet;

public class accendingFile {
	public Set<String> ass(){
	File[] files = new File("C:\\Users\\akash\\Documents\\demofiles").listFiles();
	
	Set<String> set= new TreeSet<>();
	int flag =0;
			for(File f : files){
				if(f.isFile()) {
					set.add(f.getName());
					flag=1;
					}
				}
			if(flag==1)
			return set;
			else {
				set.add("Folder is enpty");
				return set;
			}
	}
}

