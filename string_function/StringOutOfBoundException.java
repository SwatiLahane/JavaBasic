package string_function;

public class StringOutOfBoundException {

	public static void main(String[] args) {
		
		String s = "Swati";
		 
		System.out.println("Lenght of the string "+s.length());
		
		try
		{
			System.out.println(s.charAt(6));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Exception Handled ");
		}
        
		finally
		{
			System.out.println("Thank You");
		}
	}

}
