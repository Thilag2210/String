package String;

public class Stringmethods {

	public static void main(String[] args) {
		String s1="Thilagaraj";
		String s2="DINESH";
		String s3="Tamil English Maths Science Social";
		String s4="DINESH";
		String s5=" ";
		System.out.println(s1.startsWith("T"));
		System.out.println(s1.startsWith("h",1));
		System.out.println(s2.endsWith("I"));
		System.out.println(s1.concat(s2));
		System.out.println(s1.charAt(2));
		System.out.println(s1.length());
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.substring(3));
		System.out.println(s1.subSequence(1, 9));
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s3.contains("Maths"));
		System.out.println(s2.equals(s4));
		System.out.println(s5.isEmpty());
		System.out.println(s5.isBlank());
		System.out.println(s1.replace("g","k"));
		System.out.println(s3.replaceAll("English", "tamil2"));
		String[] sp=s3.split("\\s");
		for(String a:sp) {
			System.out.println(a);
		}

		
		
		
		
	}

}
