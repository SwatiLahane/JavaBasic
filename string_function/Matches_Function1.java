package string_function;

public class Matches_Function1 {

	public static void main(String[] args) 
	{ 
		String str = "Swati" ;
		
		//Find out given string start with S
		
		System.out.println(str.matches("S(.*)"));
		
		//Find Out if the given string has 5 characters 
		
		System.out.println(str.matches("....."));
		
		
		//find out if the given string ends with i
		
		System.out.println(str.matches("(.*)i"));
		
		//find out in the given string letter M is present or not
		
		System.out.println(str.matches("M(.*)(.*)M"));
		
		
		
	}

}
