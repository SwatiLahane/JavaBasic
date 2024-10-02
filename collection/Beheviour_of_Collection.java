package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;



public class Beheviour_of_Collection {

	public static void main(String[] args) 
	{  
		//converting child class object to the super class upcasting
       
	      Collection c1 = new ArrayList();
	      
	      //now we are getting collections methods
	      
	      //Parameter of add is object object means anything
	      //Collection is interface it has Abstract Methods only 
	      
	      
	      
	      c1.add("Swati");
	      c1.add(123);
	      c1.add("Age");
	      c1.add("Color");
	      c1.add(false);
	      c1.add(12.344);
	      c1.add(123);
	      c1.add(null);
	      c1.add(null);
	      c1.add(null);
	      
	      System.out.println(c1);
	      
	      Collection c2 = new ArrayList();
	      
	      c2.add("Rice");
	      c2.add("Sugar");
	      
	      c2.addAll(c1);
	      System.out.println(c2 );
	      
	     
 
	      boolean b = c2.equals(c1);
	      System.out.println(b);
	      
	      boolean b2 = c1.isEmpty();
	      System.out.println(b2);
	      
	      boolean b3  = c2.isEmpty();
          System.out.println(b3 );	      
	      
	   /*   c1.clear();
	      System.out.println(c1); */
          
       
     /*    c1.remove(123); //we can remove perticular object
         System.out.println("New c1 is->"+c1);
         System.out.println("Old C2  is->"+c2);
              
         
         //here removing all the content of c1 from c2
	     c2.removeAll(c1); //remove all the collection from c1 inside c2
	     System.out.println(c2);   */
	    
       
	    System.out.println("Forward Iteration using Iterator"); 
        Iterator i1 =  c1.iterator();
        
        while(i1.hasNext())  //hasnext return boolean 
        {
        	System.out.println(i1.next());
        }
        
       
        System.out.println( c1.size()); //size is 5 index start from zero
        
       boolean b4 = c1.contains("Lahane");
        System.out.println(b4);
       
        boolean b5 = c2.containsAll(c1);
        System.out.println(b5);
        
	}

}
