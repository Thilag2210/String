package String;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the first String:");
			String s1=sc.nextLine();
			System.out.println("Enter the Second String:");
			String s2=sc.nextLine();
			int a=s1.length();
			int b=s2.length();
			if(a>b) {
				System.out.println("Banana is maximum String:"+s1);
			}else {
				System.out.println("Apple is small"+s2);
			}
	}

}
