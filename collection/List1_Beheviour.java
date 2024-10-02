package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List1_Beheviour {

	public static void main(String[] args)
	{
		
	      List li = new ArrayList();
		    li.add(98);
		    li.add(63);
		    li.add(342);  
		    li.add(342);
		    li.add(342);                 
		    li.add(0);
		    li.add(1);
		    
		    
		    System.out.println("Before sorting :");
		    System.out.println(li);
		    
		    
		    System.out.println("After sorting :");
		    
//It doest not auto sort we have to sort explicitly
		   Collections.sort(li);
		    
		    System.out.println(li);
		

	}

}
