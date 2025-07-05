package java2;

public class demo7 {
int a=30;// a=30 global/ and using "this." defined the gobal other than local 
void test(int a) {//a=50
	this.a=a;//50=50 and (this.a is the reason of global variable
}
public static void main(String[]args) {

 demo7 d1 = new demo7();
 System.out.println(d1.a);// a=30
 d1.test(50);
 System.out.println(d1.a);//a=50 bcs of this.a 
}
}