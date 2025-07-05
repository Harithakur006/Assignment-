package assignments;

public class Reverse {
	public static void main(String[]args) {
		String str= "harishankar";
		
		StringBuffer ab=new StringBuffer();
		
		ab.append(str);// stringBuffer use for append Strings
		ab.reverse();
		
		System.out.println(ab);
	}

}
