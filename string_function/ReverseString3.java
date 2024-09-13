package string_function;
import java.util.*;
public class ReverseString3 {

	public static void main(String[] args) 
	
	{
		       Scanner sobj = new Scanner(System.in);
		       System.out.println("Enter Original string :");
		       
	    	    String input = sobj.nextLine();
	    	   
	    	    String output = " ";
	    	  
	    	    for(int i = input.length()-1 ; i >= 0; i--)
	    	      {
	    		     char c1 = input.charAt(i);
	    		     output= output + c1;
	    
	    	      }
	    	      
	    	    	 
	    	   System.out.println("Rverse String is "+output );
	    	   
	    	   
	    	   
	     }
	}

