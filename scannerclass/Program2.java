package scannerclass;
import java.util.*;

//check even
public class Program2 
{
   public static void main(String argp[])
   {
	   Scanner sobj = new Scanner(System.in);
	   
	   System.out.println("Enter Number :");
	   int ino = sobj.nextInt();
	   
	   if(ino % 2 == 0)
	   {
		   System.out.println("Even Number ");
	   }
	   else
	   {
		   System.out.println("Odd Number ");  
	   }
		  
   }
}
