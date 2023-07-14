package String;

public class RemoveDuplicate {

	public static void main(String[] args) {
			String s1="Java Exercises";
			
			for(int i=0;i<s1.length();i++) {

				for(int j=i+1;j<s1.length();j++) {
					char ch=s1.charAt(i);
					
					if(ch==s1.charAt(j)) {
						System.out.print(ch);
						
					}
					
				}
			}



	}

}
