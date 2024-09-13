package exceptionHandling;

public class Try_Ctach {

	public static void main(String[] args)
	{
		/*
		int a = b/c; //can b comes from grand parent class 
		//can c comes from parenet class 
		*/

	
		    try
		    {
		    	int c = 1/0;
		    	System.out.println(c);
		    	//int d = 1/1;
		    	
		    	//System.out.println(d);
		    }
			catch(ArithmeticException e)
			{
				System.out.println("Sorry but there was a blockeer but we handled it in ");
			}
		    catch(NullPointerException e2)
		    {
		    	System.out.println("Sorry but there was a blockeer but we handled it in 2");
		    }
		    catch(ArrayIndexOutOfBoundsException e3)
		    {
		    	System.out.println("Sorry but there was a blockeer but we handled it in 3");
		    }
		    catch(ClassCastException e4)
		    {
		    	System.out.println("Sorry but there was a blockeer but we handled it in 4");
		    }
		 
		    finally
		    {
		    	System.out.println("Thank you for using It");
		    }
		    
			
         
		
	}
           
}
