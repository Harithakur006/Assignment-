package java2;

public class Demo8 {
Demo8(){
	System.out.println("first");
	
}
Demo8(int a){
	this();
	System.out.println("second");
	
	
	
}
public static void main(String[]args) {
	Demo8 d1= new Demo8(8);
}//if not give value in new demo then it will take first as default
}
