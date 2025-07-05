package java2;

public class demo22 {
static int a = 30;// static variable
static void run() {
	System.out.println("this is static run");
	
}
public static void main(String[]args) {
	run();
	a=50;
	System.out.println(a);
}
}
