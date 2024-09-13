package basicpackage;

import java.util.Scanner;



public class Switch_case1 {

	//Sxchool exm time
	   public static void main(String args[])
	   {   
		   Scanner sobj = new Scanner(System.in);
		    System.out.println("Enter your choice ");
		    int ino = sobj.nextInt();
		    switch(ino)
		   {
			   case 1 : System.out.println("Your exam is at 8 O clock");
			   		   break;
			   
			   case 2:  System.out.println("Your exam is at 10 O clock");
		       break;
		    
		       
		       default :
		    	   System.out.println("Invalid Option");
		   }
	   }      
}
