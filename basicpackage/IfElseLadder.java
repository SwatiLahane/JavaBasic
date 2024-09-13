package basicpackage;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) 
	{
		   
		   Scanner sobj = new Scanner(System.in);
	   	   System.out.println("Pprimary Scool porter :");
	   	   System.out.println("Enter your Division");
	   	   int Standard  = sobj.nextInt();
	   	 
		   	 if(Standard == 1)
		   	 {
		   		 System.out.println("Your exam is at 8 am");
		   	 }
		   	 else if(Standard == 2)
		   	 {
		   		 System.out.println("Your exam is at 9 am");
		   	 }
		   	 else if(Standard == 3)
		   	 {
		   		 System.out.println("Your exam is at 10 am");
		   	 }
		   	 else if(Standard == 4)
		   	 {
		   		 System.out.println("Your exam is at 12 pm");
		   	 }
		   	 else if(Standard == 5)
		   	 {
		   		 System.out.println("Your exam is at 1 pm");
		   	 }
		   	 else
		   	 {
		   		 System.out.println("Invalid Standard");
		   	 }
  
	 }

	}


