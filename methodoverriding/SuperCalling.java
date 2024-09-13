package methodoverriding;

class Google
{
	Google()
	{
		System.out.println("Google");
	}	
}
public class SuperCalling extends Google
{      
	   SuperCalling()
	   {   
		 // if we write super calling statemet or not program will execute 
		 //it is available implicity in first line of constructor
		   
		   super(); //super calling statement 
	       System.out.println("Super Calling ");
      
	   }
       public static void main(String arg[])
       {
           SuperCalling sobj = new SuperCalling();
           
           
       }
} 

