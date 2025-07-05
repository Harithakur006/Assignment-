package java2;

public class demo5 {
public static void main(String[]args) {
	System.out.println("line one");
	int a=20;
	int  b=5;
	int c=70;
	if (a > b && a> c) {
		System.out.println("a is greater");
	}
	else if (b > a && b > c) {
		System.out.println("b is greater");
	}
	else {
		System.out.println("c is greater");}
	return;
}
 public static void secondmain(String[]args) {
	 System.out.println("line 1");
	 String str= "third";
	 switch(str) {
	 case "first": System.out.println("first one 1");
	 case "second": System.out.println("first 2");
	 case "third": System.out.println("first 3");
	 break;
	 case "fourth": System.out.println("first 4");
	 case "fifth": System.out.println("first 5");}
 }
}

