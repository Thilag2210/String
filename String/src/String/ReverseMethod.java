package String;
import java.util.Scanner;
public class ReverseMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String s1=sc.nextLine();
	
		StringBuilder sb=new StringBuilder(s1);
		sb=sb.reverse();
		System.out.println(sb);
	}

}
