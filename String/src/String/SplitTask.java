package String;
import java.util.Scanner;
public class SplitTask {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the string name:");
			String s1=sc.nextLine();
			String[] s2=s1.split("\\s");
			String s3="";
			for(int i=0;i<s2.length;i++) {
				s3=s3+s2[i].substring(0,1).toUpperCase()+s2[i].substring(1)+" ";
			}
			System.out.println(s3);
			
		
	}

}
