package exceptionHandling;

public class Try_Catch1 {

	public static void main(String[] args) 
	{
	    
		try
		{
			int i = 1/0;
			
			System.out.println(i);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handled ");
		}
		
		catch(NullPointerException e1)
		{
			System.out.println("Exception handled");
		}
		System.out.println("Welcome");

	}

}
