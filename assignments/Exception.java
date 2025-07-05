
//.ArrayIndexOutOfBound Exception//

package assignments;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		 int ar[] = { 1, 2, 3, 4, 5 };
	        try {
	            for (int i = 0; i <= ar.length; i++)
	                System.out.print(ar[i]+" ");
	        }
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("\nException caught");
	       
	        }
		
		  }

	}


