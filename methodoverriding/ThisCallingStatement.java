package methodoverriding;

public class ThisCallingStatement 
{
	ThisCallingStatement(int a)
	{
		 this(12.4);
		System.out.println("Constructor with integer parameter ");
	}
	ThisCallingStatement(double b) 
	{
		//this();
	    System.out.println("Constructor with Double parameter ");
	}
	ThisCallingStatement ()
	{   
		this(12);
		System.out.println("Default Constructor no parameter ");
	}
   public static void main(String arg[])
   {
	   ThisCallingStatement tobj =  new ThisCallingStatement();
	   
   }
} 
