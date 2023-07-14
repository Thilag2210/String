package String;
import java.util.Scanner;
public class Operator {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the first String:");
			String s1=sc.nextLine();
			System.out.println("Enter the Second String:");

			String s2=sc.nextLine();
			System.out.println(s1.equals(s2));
			System.out.println(s1.equals(s1));
			System.out.println(s1==s2);

			System.out.println(s1==s1);

			System.out.println(s1.compareTo(s2));
			System.out.println(s2.compareTo(s2));

	}

}
