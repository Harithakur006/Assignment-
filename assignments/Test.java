package assignments;

public class Test {
	public class Exception2 {

	    public static void main(String[] args) {
	        // Initializing String variable with null value 
	        String str = null;
	        
	        // This will throw a NullPointerException
	        // because str is null and substring(0, 5) is called on it
	        String message = str.substring(0, 5);
	        System.out.println(message);
	        
	        // Initializing String variable with a non-null value 
	        str = "hari";
	        
	        // This will not throw an exception, but the output is safe to show
	        message = (str == null) ? "" : str.substring(0, 5);
	        System.out.println(message); 
	    }
	}

}
