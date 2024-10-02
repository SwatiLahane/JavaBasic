package mapinterface14aug;

import java.util.HashMap;
import java.util.Map;

public class Map2 {

	public static void main(String[] args)
	{
		Map<Integer,Double> m1 = new HashMap<Integer, Double>();
		m1.put(7854, 854.78);
		m1.put(7855, 9876.73);
		m1.put(7554, 52365.55);
		m1.put(9632, 854.78);
		
		m1.putIfAbsent(45, 67.66);
		m1.putIfAbsent(7854, 854.78);
		System.out.println(m1);
		 
		
		for(Integer i1 : m1.keySet())
		{
			System.out.println("Saleries :"+ i1);
		}
		
		for(Double d1 :m1.values())
		{
			System.out.println("Value :"+d1);
		}
		
	}

}
