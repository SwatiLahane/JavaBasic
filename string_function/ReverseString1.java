package string_function;

import java.util.Scanner;

public class ReverseString1 
{   
	 public static void main(String arg[])
     {   
		 Scanner sobj = new Scanner(System.in);
		 
		 System.out.println("Enter Original string :");
		     
    	    String str = sobj.next();
    	     
    	     String rev = " ";
    		
    	     char Arr[] = str.toCharArray();
    		
    	   for(int i = 0 ; i < str.length(); i++)
    	   {
    		   
    		   rev = Arr[i] + rev;
    
    	   }
    	   System.out.println("Rverse String is "+rev);
    	   
    	  
    		
     }
	
	 
	 
}
	

