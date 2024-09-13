package exceptionHandling;

import java.util.Arrays;
import java.util.InputMismatchException;

public class FinallyBlock
{
   public static void main(String[] arg)
   {
	   int Rollno[] = new int[5];
	     Rollno[0] = 85;
	     Rollno[1] = 96;
	     Rollno[2] = 55;
	     
	     
	     System.out.println(Arrays.toString(Rollno));
	     try
	     {
	        Rollno[3] = 21;   //try block will not execute here
	     }
	     
	     catch(ArrayIndexOutOfBoundsException a)
	     {
	    	 System.out.println("Exception Handled 1");
	     }
	     
	     catch(InputMismatchException a1)
	     {
	    	 System.out.println("Exception Handled 2");
	     }
	     catch(NullPointerException a3)
	     {
	    	 System.out.println("Exception Handled 3");
	     }
	     finally
	     {
	    	 System.out.println("Thank u using out application have a greate day "); 
	     }
	    
   }
}
