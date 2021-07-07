import java.util.*;
public class lockers {

	public static void main(String[] args) {
		System.out.println("Welcome to LockedMe.com developed by Akash Das");
		int flag=1;
		while(flag==1) {
		System.out.println("Press Y to continue and N to exit from the application");
		
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		
		if(ch=='N' || ch=='n') {
			System.out.println("Thank you");
			flag=0;
		}
		
		
		else if(ch=='Y' || ch=='y'){
			System.out.println("Press 1 to display current file names in ascending order");
			System.out.println("Press 2 to add a file to the existing directory list");
			System.out.println("Press 3 to Delete a user specified file from the existing directory list");
			System.out.println("Press 4 to Search a user specified file from the main directory");
			System.out.println("Press 0 to exit from the application");
			try {
			int n=sc.nextInt();
			switch(n) {
			case 1:{accendingFile a=new accendingFile();System.out.println(a.ass());}
				break;
			case 2:{
				System.out.println("Enter file name of the new text file which you want to add");
				sc.nextLine();
				String name=sc.nextLine();
				System.out.println("Enter the data which you want to add in the text file");
				String data=sc.nextLine();
				addFile a=new addFile();
				a.add(name, data);
			}
				break;
			case 3:{
				System.out.println("Enter file name of the text file which you want to delete");
				sc.nextLine();
				String name=sc.nextLine();
				deleteFile del=new deleteFile();
				del.delete(name);
			}
				break;
			case 4:{
				System.out.println("Enter file name of the text file which you want to search");
				sc.nextLine();
				String name=sc.nextLine();
				SearchFile s=new SearchFile();
				s.search(name);
			}
				break;
			case 0:System.out.println("Thank you");flag=0;
				break;
			default:System.err.println("Invalid Input");
				break;
			}
		}catch(Exception E) {
			System.out.println("Wrong Input. Please try againy");
		}
		}
		
		else {
			System.err.println("Ivnalid Input. Please try again");
		}
	}
	}
	}	


