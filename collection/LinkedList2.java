package collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) 
	{
	
		LinkedList<Integer> li = new LinkedList<Integer>();
		
		 li.add(12);
	     li.add(88);
	     li.add(23);
	     li.add(2);
	     li.add(234);
	     
	     
	     System.out.println("Before Sorting : ");
	     System.out.println(li);
	     
	     System.out.println("After Sorting : ");
	     Collections.sort(li );  //It Sorts
	     
	     
	     System.out.println(li);
	     
	     
	     
	     
	     
	    
	}

}
