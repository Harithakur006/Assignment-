package java2;

import java.util.Scanner;

public class Apple {
	private char[] a;

	public static void main(String[]args) {
	Scanner input =new Scanner(System.in);
	Apple a1 = new Apple();
	System.out.println(a1.a);
	
	RedApple r1 = new RedApple();
	System.out.println(r1.a);
	}

}
