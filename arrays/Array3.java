package arrays;

//print arraya of double data type 
import java.util.Arrays;
import java.util.Scanner;

public class Array3 
{
   public static void main(String arg[])
   {
	   double d[] = new double[4];
	   Scanner sobj = new Scanner(System.in);
	   System.out.println("Enter Elements of an array :");
	   for(int i= 0 ; i < d.length; i++)
	   {
		   d[i] = sobj.nextDouble();
	   }
	   
	   System.out.println(Arrays.toString(d));
	   
	   
   }
}
