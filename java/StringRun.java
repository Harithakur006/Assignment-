package java4;

public class StringRun {
public static void main(String[]args) {
	String s1=new String("java");
	String s2="java";//its not value its object only
	String s3=new String("java");
	String s4="java";
	String s5="java";
	System.out.println(s2==s5);
	
	int i=s1.length();// string method
	System.out.println(i);
	
	String s6 = "test";// empty method
	System.out.println(s1.isEmpty());
	
	String s7="i love you";
			System.out.println(s7.contains("love")); // specific find a something
			System.out.println(s1.equalsIgnoreCase(s2));//  for case
			System.out.println(s2.indexOf('v'));
			System.out.println(s1.equals(s2));// showing the equality of value
			
			String str = "i love java";
			String[] s9 = str.split(" ");
			for (String s11:s9) {
				System.out.println(s11);
			}
			
			
		//also have trim class
			
			
			
			
			
			
			
			
			
			
			
			
			
}


}


