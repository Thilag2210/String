package String;

public class CharTask {

	public static void main(String[] args) {
		String s1="rabbit bribe dog";
		String s2= "bib";
		int count=0;
		String s3[]=s1.split(" ");
		for(int i=0;i<s3.length;i++) {
			for(int j=0;j<s3[i].length();j++) {
				if(s3[i].charAt(j)==s2.charAt(0)||s3[i].charAt(j)==s2.charAt(1)||s3[i].charAt(j)==s2.charAt(0)) {
					count++;
				}

			}
		}
		System.out.println(count);
			}
		}
		

	

