package mapinterface14aug;

import java.util.HashMap;
import java.util.Map;

public class Map3 {

	public static void main(String[] args) 
	{
	  Map<Integer,Double> m1 = new	HashMap<Integer,Double>();
        
	  m1.put(7854, 8654.8);
	  m1.put(9854, 8907.8);
	  m1.put(8854, 765.8);
	  
	  for(Integer i1: m1.keySet())
	  {
		  System.out.println("Salaries :"+i1);
	  }
	  
	  for(Double i2 : m1.values())
	  {
		  System.out.println();
	  }
	}

}
