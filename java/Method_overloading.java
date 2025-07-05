
public class Method_overloading {
static int plushMethodInt(int x,int y) {
	return x +y;
}
static double plusMethoddouble(double x,double y) {
	return x +y;
}
public static void main(String[]args) {
	int myNum1 = plushMethodInt(9 , 6);
	double myNum2 = plusMethoddouble(4.89 , 9.78);
	System.out.println("int:" + myNum1);
	System.out.println("double:" + myNum2);
}
}
