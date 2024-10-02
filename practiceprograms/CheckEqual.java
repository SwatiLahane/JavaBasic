package practiceprograms;

import java.util.Scanner;

//In equals method the string should lower or upper case all the letter
//if both name is same but one in uper case and othe rin lower ther it will give false
import string_function.EqualFunction;

public class CheckEqual {

	public static void main(String[] args) {
		
		//String name = "Swati";
		//String name2 = "Swati";
		
		//System.out.println(name.equals(name2));
		
    /*	String S1 = "ABCD";
		String S2 = "ABCD";
		
		System.out.println(S1.equals(S2));   */
		
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter A string to check equal or not ");
 		 String s1 = sobj.nextLine();
 		 
 		 System.out.println("Enter A second string to check equal or not");
 		 String s2 = sobj.nextLine();
 		 
 		 System.out.println(s1.equals(s2));
 		 
		

	}

}
