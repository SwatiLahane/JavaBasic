package exceptionHandling;

import java.util.Scanner;
import java.util.*;

public class Array_try_Catch {

	public static void main(String[] args)   
	{
		 Scanner sobj = new Scanner(System.in);
		 
		 System.out.println("Enter Size of Array :");
		 int isize  = sobj.nextInt();
		 
		 int Arr[]  = new  int[isize];
		 
		 System.out.println("Enter Number Element u want to tore in an array");
		 
		 try
		 {
			 for(int i =0; i <= isize; i++)
			 {
				 Arr[i] = sobj.nextInt();
			 } 
		 }
		 
		 
		 catch(ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println("Exception Handled ");
		 }
		 
		 catch(InputMismatchException e)
		 {
			 System.out.println("Exception Handled ");
		 }
  
		System.out.println("Your Enterd Array :");
	    
		try
		{
	   for(int i =0; i <= isize; i++)
	   {
		 System.out.println(Arr[i]+""); 
	   } 
	}
		catch(ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println("Exception Handled ");
		 }
		 
	}
}
