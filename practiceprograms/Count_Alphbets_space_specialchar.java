package practiceprograms;

import java.util.Arrays;

public class Count_Alphbets_space_specialchar {
	
	static int Count_Alphabets = 0;
	static int Count_Numeric = 0;
	static int Count_space = 0 ;
	static int Count_Special_Characters = 0;
	

	public static void main(String[] args) 
	
	{
	   
	  String Str = "Testing 1with 2$#Swati";
	  
	  char ch[] = Str.toCharArray();
	  
	  System.out.println(Str.length());
	  
	  System.out.println(Arrays.toString(ch));
	  
	  for(int i = 0; i < Str.length(); i++)
	  {
		 
		 boolean ans = Character.isAlphabetic(ch[i]);
		 
		 if(ans == true)
		 {
			 Count_Alphabets++;
		 }
		 
		 
	  }
	  
	  System.out.println("Total Alphabets Are ->"+Count_Alphabets);
	  
	  System.out.println("Count Digits in a String :");
	 
	 for(int i = 0; i < Str.length(); i++)
	 {
		boolean Ans1 = Character.isDigit(ch[i]) ;
		{
			if(Ans1 == true)
			{
				Count_Numeric++;	
			}
		}
		
	 }
		System.out.println("Toatal Number of digit in String are ->"+Count_Numeric);

	   System.out.println("Count Spaces in a string :");
	   
	   for(int i = 0; i < Str.length(); i++)
	   {
		  
		   boolean Ans2 = Character.isSpaceChar(ch[i]);
		   
		   if(Ans2 == true)
		   {
			   Count_space++;
		   }
	   }
	   
	   System.out.println("Total Number of spaces in string ->"+Count_space);
	
	   System.out.println("Total Number Of Special Characters ");
	
	   
	  Count_Special_Characters  = Str.length() - (Count_Alphabets+ Count_space+Count_Numeric);
	  
	  System.out.println("Special Characters Are "+Count_Special_Characters);
	  
	}
	
	

}
