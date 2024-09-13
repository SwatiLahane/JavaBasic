package exceptionHandling;

//import java.util.ex
import java.util.Arrays;
import java.util.InputMismatchException;

//Wee  can use block from rollno zero itself for whole array from rollno[0] 
    //if we are taking the value from user user can enter any number of array size

public class Try_Catch {
   
	public static void main(String[] args) 
	{
	     int Rollno[] = new int[3];
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
	    	 System.out.println("Exception Handled");
	     }
	     //ArrayIndexOutOfBoundsException
        
	     //Above we handled exception thats why this line is executing
	     catch(InputMismatchException a1)
	     {
	    	 
	     }
	     catch(NullPointerException a3)
	     {
	    	 
	     }
	     
	     System.out.println("The Rollnos are");
	}

}
