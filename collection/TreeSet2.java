package collection;

import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TreeSet2 { 

	public static void main(String[] args)
	{
		 TreeSet<String> ts= new TreeSet<String>();
	      
         ts.add("Swati");
	     ts.add("Saavi");
	     ts.add("Harry");
	     ts.add("Rohit");
	     ts.add("Reshem");
	     
	 
	     System.out.println(ts);
	     
	     java.util.Iterator<String> i = ts.iterator();
	     
	     System.out.println("Forward Iteration");
		  while(i.hasNext())
		  {
			  System.out.println(i.next());
		  }

	     
	    
	     
	     
	}

}
