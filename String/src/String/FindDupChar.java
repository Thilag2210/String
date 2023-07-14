package String;

public class FindDupChar {

	public static void main(String[] args) {
		String s1="soorarai potru";
		char ch[]=s1.toCharArray();
		int count=0;
		System.out.println("The Duplicate character are:");
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					System.out.print(ch[i]+" ");
					count++;
				}
			
			}
		}
		System.out.println();
		System.out.println("The duplicate count is:"+count);
}

}
