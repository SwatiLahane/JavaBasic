package loop;

import java.util.*;
public class WhileLoop1 {

	public static void main(String[] args) 
	{
	     Scanner sobj = new Scanner(System.in);
	     System.out.println("Enter Number how many times u want to print Mssage:");
	     int ino = sobj.nextInt();
	     
	     
	      int  i = 1;   //Initialization
	     while(i <= ino) //Condition
	     {
	    	 System.out.println("Hello");
	    	  i++;
	     }
        
	}

}
