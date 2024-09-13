package exceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) throws NullPointerException, InterruptedException
	{
	  // throw new NullPointerException();  //syntax 1
		Thread.sleep(2000);
	   throw new NullPointerException("Sorry the file is Empty "); //syntax 2
	    
	     
	   
	   
	//throw new IllegalArgumentException(e );	

	}

}
