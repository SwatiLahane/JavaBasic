package exceptionHandling;

import java.util.Scanner;

public class Throw_Example1 {

	static void VotingAgeCheck(int age)throws IllegalArgumentException
	{   
		
		

		if(age < 18)
		{   
			throw new IllegalArgumentException("Your Age should be above 18 to vote ");
			
		}
		else
		{
			System.out.println("You Are Eligible for Vote ");
		}
		
		}
		public static void main(String[] args)
		{
		     Scanner sobj = new Scanner(System.in);
		     System.out.println("Enter Your Age to check You r eligible for Vote or Not :");
		     int ivalue = sobj.nextInt();
		     
		     
		     try
		     {
		    	 VotingAgeCheck(ivalue); 
		     }
			
		     catch(IllegalArgumentException ex)
		     {
		    	 System.out.println(ex.getMessage());
		     }
	  
	}

	

}
