package exceptionHandling;

import java.util.Scanner;

public class Throw_Example {
 
	public static void VotingAgeCheck(int age)throws IllegalArgumentException
	{   
		
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Age");
		 int age1 = sobj.nextInt();
		
		 
		if(age1 < 18)
		{
			throw new IllegalArgumentException("You Should be 18 or above 18 to vote ");
			
		}
		else
		{
			System.out.println("Eligible to vote.");
		}
	}
	  
	public static void main(String[] args) 
	{    
		 
		try
		{
			VotingAgeCheck(17);
		}
		catch(IllegalArgumentException illegalArgs)
		{
			System.out.println(illegalArgs.getMessage());
		}
		
		
		
		//VotingAgeCheck(17);
		//VotingAgeCheck(19);

	}

}
