package String;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the first String:");
			String s1=sc.nextLine();
			System.out.println("Enter the Second String:");
			String s2=sc.nextLine();
			System.out.println("After swap  1st string:"+s1.replaceAll(s1, s2));
			System.out.println("After swap 2nd string:"+s2.replaceAll(s2, s1));


			

	}
}
