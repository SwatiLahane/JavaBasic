package practiceprograms;

import java.util.Arrays;

public class Special_Characters 
{
    //find alphabet 
	//find spaces 
	//find digits 
	//find special character
     static int count_of_Alphabet = 0;
     static int count_of_Space = 0;
     static int count_of_Numberic =0;
     static int count_of_special_character =0;
    
	public static void main(String arg[])
	{
		String s1 = "Lahane 123 $%&*";
		 
		 char []ch = s1.toCharArray();
		 System.out.println(Arrays.toString(ch));
		 
		 System.out.println("Counting  alphabet");
		 
		 for(int i = 0; i < s1.length(); i++)
		 {   
			boolean ans =  Character.isAlphabetic(ch[i]);
			 //System.out.println("Alphabets are "+ans);
			 
			 if(ans == true)
			 {
				 count_of_Alphabet++;
			 }
			 
		 }
		 System.out.println("Total Count of alphabets are "+count_of_Alphabet);
		
		 
		 for(int i = 0; i < s1.length(); i++)
		 {   
			boolean ans =  Character.isSpaceChar(ch[i]);
			 //System.out.println("Alphabets are "+ans);
			 
			 if(ans == true)
			 {
				 count_of_Space++;
			 }
			 
		 }
	    System.out.println("totalCOunt of space "+count_of_Space);
		 
	    System.out.println("Finding Digit / Numeric ");
	    
	    for(int i = 0; i < s1.length(); i++)
	    {
	    	
	    	boolean ans =  Character.isDigit(ch[i]);
	    	//System.out.println("Count of digit is "+ans);
	    	  {
	    		  if(ans == true)
	    		  {
	    			  count_of_Numberic++;
	    		  }
	    	  }
	    	  
	     }
	    System.out.println("Count of Digit is :"+count_of_Numberic);
	   
	    
	    
	    
	    System.out.println("Count of special character :");
	    
	    count_of_special_character = s1.length() -(count_of_Alphabet +  count_of_Space + count_of_Numberic);
	    
	    System.out.println("count of special character is :"+count_of_special_character);
	}
}	
	
	
	
	
