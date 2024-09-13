package string_function;

import java.util.Arrays;

  
//to check alphabet or not ,digit or not ,numberic,special characters 
public class String_Character                            
{    
	//static int Count = 0;
	//static int Count1 = 0;
	
	public static void main(String arg[])
	{    
		
		String input = "kv no 1 @*";
		char []c1 = input.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for(int i = 0; i < input.length(); i++)
		{
			boolean answer = Character.isAlphabetic(c1[i]);
			
			System.out.println(answer);
			
		}
		
		 System.out.println("Finding numeric :");
		for(int i = 0; i < input.length(); i++)
		{
			boolean answer1 = Character.isDigit(c1[i]);
			System.out.println(answer1);
		}
	
		System.out.println("Finding Space :");
		for(int i = 0; i < input.length(); i++)
		{
			boolean answer2 = Character.isSpaceChar(c1[i]);
			System.out.println(answer2);
			
		}
		
		/*System.out.println("Finding special character ");
		{
			System.out.println(Count1);
			int a = input.length() - (Count + Count1);
			System.out.println(a);
		}  */
		
	}
   
  
}
