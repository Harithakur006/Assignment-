package java4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;


public class ListRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList arrr =  new ArrayList();
	//<Integer>-if we put after arraylist that contain only integer type data//


LinkedList	arr = new LinkedList();//linked list
/* linked use to conenct and list to store the data*/

        arrr.add(20);
		arrr.add("string");
		arrr.add(true);
		arrr.add('c');
		
		//duplicates are allowd in arraylist//
				System.out.println(arrr);// for printing 
				
				System.out.println(arrr.size());
				//for size of data have
				
				System.out.println(arrr.get(2));// showing which data i want
				/// called as  -bit shift and for read mainly
				
				for(int i = 0; i<=4; i++) {
		           System.out.println(arrr.get(i));
		           //getting all data use loop//
		           
		          for(Object il:arrr) {
		        	  System.out.println(il);
		        	  } // for read anykind of data if not give type of data//
		         
		          arrr.add(0, "abc");//bit shifting data while adding//
		          System.out.println(arrr);
			// for adding new data in a diffrent line of data//	
		     //  add method with contains   
		          arrr.remove(1);//pass the data number which i want to remove//
		          System.err.println(arrr);
		          //removing the data//
		         
         System.out.println(arrr.contains('c'));
          //for searching specific of a datd//
         
          
          
          
				}
		
		}
	       

	private static void arr() {
		// TODO Auto-generated method stub
		
	}

}
