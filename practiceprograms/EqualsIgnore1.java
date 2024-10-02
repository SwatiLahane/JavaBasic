package practiceprograms;

import java.util.Scanner;

//equals igrnore ignores capital or small letters it only check string is same or not 
public class EqualsIgnore1 
{
   public static void main(String arg[])
   {
	   /*String s1  = "Swati" ;
	   
 	   String s2 = "SWATI";
	   
	   System.out.println(s1.equalsIgnoreCase(s2)); */
	   
	 /*  String s1 = "Sunita" ;
	   String s2 = "SWAti";
	   
	   System.out.println(s1.equalsIgnoreCase(s2));  */ 
	   
	   
	   Scanner sobj = new Scanner(System.in);
	   System.out.println("Enter first String :");
	   String s1 = sobj.nextLine();
	   
	   System.out.println("Enter Second String :");
	   String s2 = sobj.nextLine();
	   
	   System.out.println(s1.equalsIgnoreCase(s2));
	   
   }
}
