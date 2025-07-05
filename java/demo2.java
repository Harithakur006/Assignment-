package java4;
interface idemo{
	void test();
	public final static int i=10;
//if we dont write then it will take default by compiler.	
}
interface idemo2{
	public abstract void test();
}
 class cdemo implements idemo{
	 public void test() {
		
	}
	 public void run() {
		 
	 }
}

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(idemo.i);
	}

}// interface bydefault put public final static int on my behalf
