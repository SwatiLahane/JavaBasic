package practiceprograms;

import java.util.Arrays;

public class Count_Alphabet_space_Digit_Specialchar {
     
	static int Count_Alphabets  = 0;
	static int Count_Space = 0;
	static int Count_Special_chara = 0;
	static int Count_Numeric  = 0;
	  
	
	
	public static void main(String[] args) 
	{
	   String Str = "Testing 123Java@#&";
	   
	   char ch[] = Str.toCharArray();
	   System.out.println(Arrays.toString(ch));
	   
	   System.out.println(Str.length());//count start from 1
	   
	   System.out.println("Finding Alphabets in an string ");
	   for(int i = 0; i < Str.length(); i++)
	   {
		    boolean b = Character.isAlphabetic(ch[i]);
		    
		    if(b == true)
		    {
		    	Count_Alphabets++; 
		    }
		    
	   }
	    System.out.println("The total Alphabets are ->"+Count_Alphabets);

       System.out.println("Finding Numeric values in a string"); 	  
     
       for(int i = 0; i < Str.length(); i++)
       {
    	    boolean b1= Character.isDigit(ch[i]);
    	    
    	    
    	    if( b1 == true)
    	    {
    	    	Count_Numeric++;
    	    }
    	    
       }
	    System.out.println("The total numerics are ->"+Count_Numeric);
        
	    System.out.println("finding space ");
	    
	    for(int i = 0; i < Str.length(); i++)
	    {
	    	boolean b2 = Character.isSpaceChar(ch[i]);
	    	{
	    		if(b2 == true)
	    		{
	    			Count_Space++;
	    		}
	    	}
	   
	    }
	    
	    System.out.println("The total Numebr of spaces :"+Count_Space);
	    
	   System.out.println("Counting Special Characters");
	   
	   Count_Special_chara  = Str.length()-(Count_Alphabets+Count_Numeric+Count_Space);
	   
	   System.out.println("Total Number of special Characters Are "+Count_Special_chara );
	
	}

}
