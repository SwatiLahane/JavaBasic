package collection;
import java.util.*;

public class ListExample { //beheviour of list

	public static void main(String[] args) 
	{    
		
		//upcasting with list list is interface 
		//list is parent 
	    List l1  = new ArrayList();	
          
	    l1.add(98);
	    l1.add(63);
	    l1.add(342);  
	    l1.add(342);
	    l1.add(342);
	    l1.add(null);
	    l1.add(null); 
	    l1.add(null);
	    l1.add("Swati");
	    l1.add("abcd");
	    l1.add(34.56);
	    l1.add("&*%");
	    
	    //Sorting is not happen automaticalling in list
	    
	    //sorting we have to do explicitly by using collections.sort
	   // Collections.sort(l1);
	    
	    //it can do asending n decending sorting
	    
	        System.out.println(l1);
	    
	        //Iteration forward
	    Iterator i2 =  l1.iterator();
	    
	    System.out.println("Forward iteration using iterator ");
	    while(i2.hasNext()) 
	    {
	    	System.out.println(i2.next());
	    }
	    
	    //using list of iterator n backward iteration
	   ListIterator l4 =   l1.listIterator();
	   //ffarwrd iteration using list iterator 
	   
	   System.out.println("Forword iteration using list iterator");
	    while(l4.hasNext())
	    {
	    	System.out.println(l4.next());
	    }
	    
	    //backwrd iteration using hasprevious
	    System.out.println("backward iteration using list iterator");
	    while(l4.hasPrevious())
	    {
	    	System.out.println(l4.previous());
	    } 
	}

}
