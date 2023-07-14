package String;

public class Task1 {

	public static void main(String[] args) {
		String s1="Ram-age is 12@";
		int count=0; int space=0;
		int number=0;
		int lower=0; int upper=0;
		int totalchar=s1.length();
		for (int i=0;i<s1.length();i++) {
		char ch=s1.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			count++;
		}

	}
		System.out.println("Vowels is "+count);
			for(int j=0;j<s1.length();j++) {
				if(s1.charAt(j)>='0'&&s1.charAt(j)<'9') {
					number++;
				}
			}
			System.out.println("number is "+number);
			System.out.println("number percentage is:"+(number*100)/totalchar+"%");
			for(int k=0;k<s1.length();k++) {
				if(s1.charAt(k)>='a'&&s1.charAt(k)<'z') {
					lower++;
				}
			}
			System.out.println("lowercase is "+lower);
			System.out.println("lower percentage is:"+(lower*100)/totalchar+"%");

			for(int x=0;x<s1.length();x++) {
				if(s1.charAt(x)>='A'&&s1.charAt(x)<'Z') {
					upper++;
				}
	}
			System.out.println("Uppercase is "+upper);
			System.out.println("uppercase percentage is:"+(upper*100)/totalchar+"%");

			for(int y=0;y<s1.length();y++) {
				if(s1.charAt(y)==' ') {
					space++;
				}
}
			System.out.println("Space is "+space);
			System.out.println("space percentage is:"+(space*100)/totalchar+"%");

			
				String d=s1.replaceAll("[a-zA-z0-9]","");
				System.out.println(d);
			
			}}
