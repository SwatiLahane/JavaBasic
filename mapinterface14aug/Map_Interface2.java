package mapinterface14aug;

import java.util.HashMap;
import java.util.Map;

public class Map_Interface2 {

	public static void main(String[] args) 
	{
		  Map<String,String> m1 = new HashMap<String , String>();
		  
		  m1.put("Student1", "Ram");
		  m1.put("Student2","Swati");
		  m1.put("Student3","Venkatesh");
		  m1.put("Student4","Sakshi");
		  m1.put("Student5","Harray");
		  
		  
		  System.out.println(m1);
		  System.out.println("before using clear method");
		  boolean b = m1.isEmpty();
		  System.out.println(b);
		  
		 
		  m1.clear();
		  System.out.println(m1);
		  
		  System.out.println("After using clear method");
		  boolean b1 = m1.isEmpty();
		  System.out.println(b1);
		  
	}

}
