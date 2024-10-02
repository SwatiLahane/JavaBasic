package mapinterface14aug;

import java.util.HashMap;
import java.util.Map;

public class MapInterface1 {

	public static void main(String[] args) {
		
		 //mAp has  Wrapper classes
		 Map<String,String> m1 = new HashMap<String ,String>();
		  m1.put("Student1", "Ram");
		  m1.put("Student2","Swati");
		  m1.put("Student3","Venkatesh");
		  m1.put("Student4","Sakshi");
		  m1.put("Student5","Harray");
		  
		  System.out.println(m1);

	}

}
