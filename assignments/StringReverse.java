package assignments;
/* without using a reverse function */
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= "harishankr";// for strait print understanding

  char arr[] = str.toCharArray();//converting string to array
  for(int i=arr.length-1; i>=0; i--) {
	  System.out.print(arr[i]);//remove ln for print in one line 
	  
	  
  }
	}

}
