package arrays;

import java.util.*;

class  Arithematic 
{   

	public boolean CheckNumber(int Brr[] , int ivalue)
	 {
		  int i = 0;
		  
		    for(i = 0; i < Brr.length; i++)
		     {
			   
		    	if(Brr[i] == ivalue)
		    	{
		    		return true;
		    	}
		    	
		    /*	else
		    	{
		    		return false;
		    	}
			  */
	         }
			return false;
		    
		    
	   }	
	  
	
}

public class CheckNumberIsPresent1 {

	public static void main(String[] args) 
	{
		 Scanner sobj = new Scanner(System.in);
		 Arithematic  aobj = new Arithematic();
		   
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
		   
		   
		    boolean ires = aobj. CheckNumber(Arr,ino);
		    
		    
		    if(ires == true)
			   {
				   System.out.println("No is present ");
			   }
			   else
			   {
				   System.out.println("Number is Not Present ");
			   }
		   
	}

}
