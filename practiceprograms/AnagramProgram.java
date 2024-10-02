package practiceprograms;

import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args)
	{
		
		 String str  = "race";
		// String str1 =  "care";
		 
		 String str1 = "seed";
		 if(str.length() != str1.length())
		 {
			 System.out.println("Not an Angram");
		 }
 		
		 char ch[] = str.toCharArray();
		 char ch1[] = str1.toCharArray();
		 
		 Arrays.sort(ch);
		 Arrays.sort(ch1);
		 
		 System.out.println(Arrays.toString(ch));
		 System.out.println(Arrays.toString(ch1));
		
      	 boolean ans = Arrays.equals(ch, ch1);
		 
      	 if(ans == true)
      	 {
      		 System.out.println("String is anagram");
      	 }
      	 else
      	 {
      		 System.out.println("String is not anagram");
      	 }
	}

}
