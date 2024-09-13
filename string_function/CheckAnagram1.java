package string_function;

import java.util.Arrays;

public class CheckAnagram1 {

	public static void main(String[] args) 
	{
		String name = "care";
		String name1 = "reca";
		 
		
		if(name.length() != name1.length())
		{
			 System.out.println("Not Anagram");
		}
		
		else
		{
			char c1[] = name.toCharArray();
			char c2[] =name1.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			
			boolean b1 = Arrays.equals(c1, c2);
			System.out.println(b1);
			
			if(b1 == true)
			{
				System.out.println("The given String is an Anagram");
			}
			
			else
			{
				System.out.println("The given String is not Anagram");
			}
		}
	}

}
