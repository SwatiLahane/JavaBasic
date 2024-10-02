package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



public class Program1 {

	public static void main(String[] args) 
	{
		  //collection is interface it only have abstract methods
		//upcasting with collection
		
        Collection c1  = new ArrayList();
        
      //parameter of add is object means anything we can store any thing 
        
        //Add method
        c1.add("Age"); 
        c1.add("colour");
        c1.add(76);
        c1.add(45.55);
        c1.add(false);
        
        System.out.println(c1);
        
     Iterator  i1 =     c1.iterator ();   
     
     while(i1.hasNext())
     {
    	 System.out.println(i1.next());
     }
     //it will print the size indexing from 0
     c1.size();
     System.out.println( c1.size());
     
    boolean b1 = c1.contains("Manish");
    System.out.println(b1);
    
     boolean b2 = c1.contains("Age"); //contains check one element only
     System.out.println(b2);
    
	}

}
