package string_function;
import java.util.*;
public class CheckPalimdrom1 
{
   public static void main(String args[])
   {
	   Scanner sobj = new Scanner(System.in);
	   
	   System.out.println("Enter the String ");
	   String str = sobj.nextLine();
	   
	   String rev = "";
	   
	   char Arr[] = str.toCharArray();
	   
	   for(int i =0 ; i < Arr.length; i++)
	   {
		   rev = Arr[i] + rev;
	   }
       
	   if(str.equals(rev))
	   {
		   System.out.println("String is palimdrome ");
	   }
	   else
	   {
		   System.out.println("String is not palimdrome");
	   }
	   
}
}
