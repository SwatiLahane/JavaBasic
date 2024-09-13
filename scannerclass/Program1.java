package scannerclass;
import java.util.*;

public class Program1 {

	public static void main(String[] args) 
	{
		
         Scanner sobj =  new Scanner(System.in);
		 System.out.println("Enter First Number :");
		 sobj.nextInt();
		 
		 System.out.println("Enter String :");
		 sobj.next();
		 
		 System.out.println("Enter Small Number:");
	     sobj.nextByte();
	     
	     System.out.println("Enter decimal point number :");
	     sobj.nextFloat();
	     
	     System.out.println("Enter decimal number for double :");
	     sobj.nextDouble();
	     
	     System.out.println("Enter long number :");
	     sobj.nextLong();
	     
	     System.out.println("Enter small number :");
	     sobj.nextShort();
	    
	
	} 

}
