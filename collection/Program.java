package collection;

import java.util.*;

public class Program {

	public static void main(String[] args) 
	{
		//collection is interface it only have abstract methods
		//thats why we do upcasting
		//we only do 
       Collection c1 = new ArrayList();
        
       //parameter of add is object means anything we can store any thing 
       
       //Add method
       c1.add("Age"); 
       c1.add("colour");
       c1.add(76);
       c1.add(76);
       c1.add(45.55);
       c1.add(false);
       c1.add(null);
       c1.add(null);
       c1.add(null);
       System.out.println(c1);
       
       //addAll method 
       Collection c2 = new ArrayList();
       c2.addAll(c1); //it will add all
       c2.add("rice");
       c2.add("suger");

       System.out.println(c2);
	       
	       //3.equals Method
	       
	     boolean b1 = c2.equals(c1);
	     System.out.println(b1);
	     
	     //isEmpty // Whichever method start with is return type is boolean
	     
	    boolean b2 =  c1.isEmpty();
	    System.out.println(b2);
	    
	    boolean b3 = c2.isEmpty();
	    System.out.println(b3);
	    
	    //Clear Method
	 /*   c1.clear();
	    System.out.println(c1); */
	    
	    //remove Method ,remove perticular object from c1
	    
	/*    c1.remove(76);
	   System.out.println("new c1 is ->"+c1);
	   System.out.println("old c2 is ->"+c2);
	   
	   c2.removeAll(c1); 
	   System.out.println("new c2 is ->"+c2);
	  
	   */
	    
	  boolean b4 = c2.containsAll(c1); //check all elements 
	  System.out.println(b4);
	   

   }
       
       
       
       
       
 	} 


