package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		
		LinkedHashSet lh =new LinkedHashSet();
		
		 lh.add(12);
	     lh.add(88);
	     lh.add(23);
	     lh.add(23);
	     lh.add("Swati");
	     lh.add("Swati");
	     lh.add(null);
	     lh.add(null);
	     lh.add(null);
	     lh.add("Shree");
	     System.out.println(lh);
		 
         Iterator i =  lh.iterator();
	     
	     System.out.println("Forward Iteration");
	     while(i.hasNext())
	     {
	    	 System.out.println(i.next());
	     }
	     
	     
	     
	}

}
