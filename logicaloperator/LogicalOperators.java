package logicaloperator;

public class LogicalOperators 
{
   
	public static void main(String arg[])
	{
		int a = 10;
		int b = 20;
		
		if(a == 10 && b == 10) // a is true b is false result is fase
		{
			System.out.println("And operator");
		}
		
		if(a == 10 || b == 10) //ek jari true asel tari true
		{
			System.out.println("Or Operator");
		}
		
		if(a == 10 && b == 20)
		{
			System.out.println("And operator if both the condition true");
		}
		
	}

}