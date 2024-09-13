package basicpackage;

import java.util.Scanner;


public class Switch_case
{   
	//Sxchool exm time
	   public static void main(String args[])
	   {   
		   Scanner sobj = new Scanner(System.in);
		    System.out.println("Enter your choice ");
		    int ino = sobj.nextInt();
		    switch(ino)
		   {
			   case 1 : 
			   		   break;
			   
			   case 2:  System.out.println("Your exam is at 10 O clocl");
		       break;
		    
		       
		       default :
		    	   System.out.println("Exit");
		   }
		      
	   }

}
