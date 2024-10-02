package collection;

import java.util.*;
public class Set1 {

	public static void main(String[] args)
	{
		 
            Set s1 = new HashSet();
            
            s1.add(10);
            s1.add(20);
            s1.add(21);
            s1.add(33);
            s1.add(44);
            s1.add("Swati");
            s1.add(null);
            s1.add(null);
            s1.add("Manisha");
            s1.add("adan");
            s1.add("Swati");
            
          //  Collections.sort(s1); we cannot sort in set
            System.out.println(s1);
            
	}

}
