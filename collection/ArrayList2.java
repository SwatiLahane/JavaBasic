package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		
		l1.add(12);
		l1.add(22);
		l1.add(32);
		l1.add(22);
		
		
		System.out.println(l1);
		
		int i1 = l1.get(2); //give value at index 32
		System.out.println(i1);
		
		Collections.replaceAll(l1, 12, 50);
		
		System.out.println(l1);
	}

}

