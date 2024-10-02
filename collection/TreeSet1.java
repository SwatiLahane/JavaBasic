package collection;
import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;
public class TreeSet1 {

	public static void main(String[] args) {
		
		        
		  //treeset only accept one type of data type values a time 
		//ex integer ,String 
		      TreeSet<Integer> ts= new TreeSet<Integer>();
		      
		         ts.add(12);
			     ts.add(88);
			     ts.add(23);
			     ts.add(23);
			     ts.add(24);
			     
			     java.util.Iterator<Integer> i = ts.iterator();
			     
			     System.out.println("Forward Iteration");
				  while(i.hasNext())
				  {
					  System.out.println(i.next());
				  }
			     
			     
			     System.out.println(ts);

	}

}
