package practiceprograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramProgram1 {

	public static void main(String[] args) 
	{
	    
		 String str = "race";
		 String str1= "cera";
		 
		 
		 if(str.length() != str.length())
		 {
			 System.out.println("Not an Anagram");
		 }
		 
		 char ch[] = str.toCharArray();
		 char ch1[] = str1.toCharArray();
		 
		 Arrays.sort(ch);
		 Arrays.sort(ch1);
		 
		 System.out.println(Arrays.toString(ch));
		 System.out.println(Arrays.toString(ch1));
		 
		 
		 boolean b1 = Arrays.equals(ch, ch1);
		 
		 if(b1 == true)
		 {
			 System.out.println("String is anagram");
		 }
		 else
		 {
			 System.out.println("String is not anagram");
		 }
		 
		 
	}

}
