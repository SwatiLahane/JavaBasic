package arrays;

import java.util.*;

public class CheckNumberIsPresent {

	public static void main(String[] args) 
	{
		
		  Scanner sobj = new Scanner(System.in);
		   
		  System.out.println("Enter The Element of Array :");
		   int isize = sobj.nextInt();
		   
		   //datatype variable = new dataype[size]
		   
		   int Arr[] =new int[isize]; 
		   int i = 0;
		   
		   for( i = 0; i < isize ; i++)
		   {
			   Arr[i] = sobj.nextInt();
		   }
		   
		   System.out.println("Enter One ANother No to check no is present or not ");
		   int ino = sobj.nextInt();
		   
		   for(i = 0; i < isize; i++)
		   {
			   if(Arr[i] == ino)
			   {
				   System.out.println("No is present at Indes "+" "+Arr[i]);
			   }
			   else
			   {
				   System.out.println("Number is Not Present ");
			   }
			   
		   }
		  
		
		
		
		
	}

}
