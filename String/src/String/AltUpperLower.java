package String;
import java.util.Scanner;
public class AltUpperLower {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the String name:");
		char s;
		String s1=sc.nextLine();
		char ch[]=s1.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<ch.length;i=i+2) {
			ch[i]=Character.toUpperCase(ch[i]);
		}
		for (int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
		}
	}


