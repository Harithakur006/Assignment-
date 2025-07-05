package assignments;

import java.util.*;
       public class AccendingSort  {

        public static void main(String args[]){
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(12);
        arraylist.add(13);
        arraylist.add(14);
        arraylist.add(1);
        arraylist.add(18);
        arraylist.add(25);
    
        /* Sorting of arraylist using Collections.sort*/
           Collections.sort(arraylist);

        /* ArrayList after sorting*/
         System.out.println("After Sorting:");
         for(int counter: arraylist){
             System.out.println(counter);
         }
        }
       }