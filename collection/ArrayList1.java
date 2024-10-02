package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args)
	{
		//ArrayList is class here is no need to do upcasting
				//
			   ArrayList l1 = new ArrayList();	//no casting we directly create object here
			    
			   
			    l1.add(12);
			    l1.add(200);
			    l1.add(300);
			    l1.add(300 );
			    l1.add("Swati");
			    l1.add("Swati");
			    l1.add(null); 
			    l1.add(null);
			    l1.add(null);
			    
			    System.out.println(l1);
			   
			    ArrayList l2 = new ArrayList();	
			      l2.add("Sonal");
			      l2.add(340);
			      l2.add("Pranay");
			      
			      System.out.println(l2);
			      ArrayList l3 = new ArrayList();	
			    boolean b1 = l1.contains(l2);
			    System.out.println(b1);
			    
			    System.out.println("Add All");
			    l2.addAll(l1); 
			    System.out.println(l2);
			    
			    
			  /*  l1.remove(1);
			    System.out.println(l1);
			    
			    
			    System.out.println("clear All l1");
			    l1.clear();
			    System.out.println(l1);
			    
			    System.out.println("remove all l1 from l2");
			    l2.removeAll(l1);
			    System.out.println(l2);
			    
			    */
			    
			    boolean b2 = l1.isEmpty();
                System.out.println(b2);
 
                boolean b3 = l2.isEmpty();
                System.out.println(b3);
                
                boolean b4 = l3.isEmpty();
                System.out.println(b4);
                
                boolean b5 = l1.equals(l2);
                System.out.println(b5);
                
               boolean b6 = l1.contains("Swati");
                System.out.println(b6);
                
                System.out.println("Conatins lahane");
                boolean b7 = l1.contains("lahane");
                System.out.println(b7);
                
                boolean b8 = l2.containsAll(l1);
                System.out.println(b8);
                
			    System.out.println("Get Index at perticular no");
			   int i1 = (int) l1.get(1); //index 1 is 200
			   
			   System.out.println(i1);
			   Iterator i = l1.iterator();
			    
			   System.out.println("Forward iterator using Iterator ");
			      while(i.hasNext())  //hashnext return boolean
			       {
			    	 System.out.println(i.next()); //next return object
			       }
			    
			      
			      
			    ListIterator li =  l1.listIterator();
			    
			    System.out.println("Forword Iteration using ListIterator");
			     while(li.hasNext())
			      {
			    	System.out.println(li.next());
			      }
			 
			    	
			    	
			    System.out.println("Backward Iteration using ListIterator"); 	
				  while(li.hasPrevious())
				   {
					   System.out.println(li.previous());
				   }
	}

}
