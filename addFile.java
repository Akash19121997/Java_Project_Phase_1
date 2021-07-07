import java.io.FileWriter;
import java.io.IOException;

public class addFile {
	public void add(String name, String data) {
		FileWriter stream=null;
		try {
			String s=name;
			stream=new FileWriter("C:\\Users\\akash\\Documents\\demofiles\\"+s+".txt");
			String str=data;
			char ch[]=str.toCharArray();
			stream.write(ch);
			System.out.println("Written");
		} catch (IOException e) {
			System.out.println("File Not Found");
		}finally {
			if(stream != null) {
				try {
					stream.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}
}


