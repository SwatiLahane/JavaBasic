package mapinterface14aug;

import java.util.HashMap;
import java.util.Map;

public class Map_Interface1 {

	public static void main(String[] args) {
		
		//Hashmap is class making relation with Map Interface
		//here we do upcasting
		
	Map<String,Double> m1  =new	HashMap<String ,Double >(); //Upcasting
	  
	
	  m1.put("Rice",50.9);
	  m1.put("Sugar",5.1);
	  m1.put("oil",5.7);
	  m1.put("jeggery",2.2);
	  m1.put("salt",1.9);
	  
	  System.out.println(m1);
	  
	 boolean b = m1.containsKey("Rice");
	  
	 System.out.println(b);
	 boolean b1 = m1.containsKey("Swati");
	 System.out.println(b1);
	 
	 boolean b2 = m1.containsValue(5.1);
	 System.out.println(b2);
	 
	 Map<String,Double> m2  =new	HashMap<String ,Double >(); //Upcasting
      m2.putAll(m1);
      m2.put("Toothpaste",2.9);
      
      System.out.println(m2);
      
     boolean b3 =  m1.equals(m2);
     System.out.println(b3);
     
     if(m1.size() == m2.size())
     {
    	System.out.println("size of both are same"); 
     }
     else
     {
    	 System.out.println("size of both are not same");  
     }
	 
	 
	 
	}

}
