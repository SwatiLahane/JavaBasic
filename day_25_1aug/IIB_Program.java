package day_25_1aug;

public class IIB_Program 
{
   
	//When we creates object IIb gets called 
	//In this case main method execute first then IIB
	
	
	{   //IIB -Instance initialization block
		
		 System.out.println("Inside IIB");
		 
		 
	}   
	     
	  
	{   //IIB
		
		 System.out.println("Inside IIB");
	}
	
	
	{    //IIB
		
		 System.out.println("Inside IIB");
		 
	}
	public static void main(String[] args)
	{
		 System.out.println("Inside Main Method");
		 
		 //Here IIB execute 6 times because we create an object two times
		 
		 
		 new IIB_Program (); //When we create an object IIB gets called
		 new IIB_Program ();
		 
 
	}

}
