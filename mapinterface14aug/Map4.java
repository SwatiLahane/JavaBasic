package mapinterface14aug;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

public class Map4 {

	public static void main(String[] args) {
		
	Map<String,Integer> m1 = new HashMap<String ,Integer>();	
      
	m1.put("Mohan", 93);
	m1.put("Sham", 83);
	m1.put("Vinod", 74);
	m1.put("Hari", 90);
	
	System.out.println(m1);
	
/*	m1.remove("Vinod");
	System.out.println(m1);
	m1.remove("Hari",90);
	System.out.println(m1); //*/ 
	
	
	m1.replace("Hari", 93);
	m1.replace("Vinod",74,99);
	
	
	System.out.println(m1);
	Map<String,Integer> m2 = new HashMap<String ,Integer>();
	
	m2.put("Swati", 85);
	m2.put("Pradeep", 86);
	m2.put("Priya", 87);
	m2.put("Anusha", 88);
	
	Set<String> s1 = m2.keySet();
    
	System.out.println(s1);
	
	  //for each loop
	for(String s2:  m2.keySet())
	{
		System.out.println(s2);
	}
	
    for(Integer i1 : m2.values())
    {
    	System.out.println(i1);
    }
	
	for(Entry<String, Integer> e1 : m2.entrySet())
	{
		System.out.println(e1);
	}
	
	 System.out.println("-------------");
	Iterator<Entry<String,Integer>> i = m2.entrySet().iterator();
	
	while(i.hasNext())
	{
		System.out.println(i.next());
	}  
}
	
}
