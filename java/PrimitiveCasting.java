package java4;

public class PrimitiveCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 byte b=10;
 int i= b;//autowinding
 
 System.out.println(i);
 int c=130;
 byte f=(byte)c;
 System.out.println(f);//forcefull converted method of bigger to low
	}

}
