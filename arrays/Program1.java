
package arrays;
import java.util.*;

//find the element 12 int an array 

public class Program1 {

	public static void main(String[] args) 
	{
	    
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter The size of array");
	    int isize = sobj.nextInt();
	    
	    //datatype variable = new datatype[size]
	    
	   
	    
	    int Arr[] = new int[isize];
	    
	       int i = 0;
	    for( i = 0; i < isize; i++)
	    {
	    	Arr[i] = sobj.nextInt();
	    	
	    }
        
	    System.out.println("Your Enterd Array ");
	    for( i = 0; i < isize; i++)
	    {
	    	System.out.println(Arr[i]);
	    	
	    }
	    
	    
	}
	
}
       
	  
	  
	   


