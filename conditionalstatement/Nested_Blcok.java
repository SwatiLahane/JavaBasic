package conditionalstatement;

public class Nested_Blcok
{   
	//Write Correct logic
	//we can write if bleck inside else block also
	public static void main(String arg[])
	{
		 int a =10;
		 int b =20;
				 
		if(a==b)
		{
			System.out.println("first if block executed");
		     if(a>=b)
			 {
		    	 System.out.println("Second if executed");
		       	 
				if(a > b)
				{		
					System.out.println("Third executed");
		      	}
			
			}
			else
		    {
			    System.out.println("Else block executed "); 	
			}
		}
		
		
	}
}
