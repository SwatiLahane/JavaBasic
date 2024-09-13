package arrays;

import java.util.Arrays;

public class ReverseArray
{
   public static void main(String arg[])
   {
	   int oldarray[] = new int[3];
	   oldarray[0] = 71;
	   oldarray[1] = 6;
	   oldarray[2] = 78;
	   
	   int Reverse_array[] = new int[3];
	   
	 /*  Reverse_array[2] = oldarray[0];
	   Reverse_array[1] = oldarray[1]; 
	   Reverse_array[0] = oldarray[2];  */
	   
	   for(int i = 0 ,k =2; i < oldarray.length; i++)
	   
		  // for(int i = 0 ,k =Reverse_array.length-1; i < oldarray.length; i++)
	   {    
		  
		   Reverse_array[k] = oldarray[i];
		     k--;
	   }
	   System.out.println(Arrays.toString(oldarray));
	   System.out.println(Arrays.toString(Reverse_array));
	   
   }
}
