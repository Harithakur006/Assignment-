package java2;

public class demo {
public static void main(String[]args) {
	int a = 10;
	int b = 20;
	
		System.out.println(a>b);
		
		int d=3;
		int f=90;  
		int c=50;
		
		System.out.println(!(a>b)&&(b>c)||(c>a));
		String result =a>b? "a is greater": "b is greater";
		
		int total = ++a + b++ +b-- + --a + --b + ++b;
		
		System.out.println(total);
		System.out.println(a);
		System.out.println(b);
		
}
}

