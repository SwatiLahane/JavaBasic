package constructorcverloading;

import java.util.Arrays;

public class String_Contains {

	public static void main(String[] args) {
		
		//
		String a1 = "Manish";
		System.out.println(a1.endsWith("h"));
		
		 String s2 = "";
		 
		String a2 = "Manish Kumar Tiwari";
		boolean ans = a2.contains("Tiwari");
		
		String []name = a2.split(" ");
		
		
		System.out.println(Arrays.toString(name));
		
		
		String a3 = "School";
		//repeat method works only above java version 11
		//System.out.println(a3.rep);
	}

}
