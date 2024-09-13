package exceptionHandling;

import java.util.Scanner;

public class ThrowsException {

	public static void main(String[] args)throws ArrayIndexOutOfBoundsException
	{
		Scanner sobj = new Scanner(System.in);
		 
		 System.out.println("Enter Size of Array :");
		 int isize  = sobj.nextInt();
		 
		 int Arr[]  = new  int[isize];
		 
		 System.out.println("Enter Number Element u want to tore in an array");
		 
		 
			 for(int i =0; i <= isize; i++)
			 { 
				 Arr[i] = sobj.nextInt();
			 } 
		   
			System.out.println("Your Enterd Array ");
			
			for(int i =0; i <= isize; i++)
			 {
				System.out.println(Arr[i]);
			 } 
  
	}

}
