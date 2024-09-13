package string_function;

public class Matches_Function2 {

	public static void main(String[] args) 
	{
	    //Matches Function
		
		String str = "Saavi";
		
		//fint out string contains s in starting or not 
		
		boolean b =  str.matches("S(.*)");
		System.out.println(b);

		
		//Find out string contains i At the end of the string or not
		
		boolean b1 = str.matches("(.*)i");
		System.out.println(b1);
		
		//find out given string has 5 characteristics
		
		boolean b2 = str.matches(".....");
		System.out.println(b2);
		
		//Find out letter M is present or not
		
		boolean b3 = str.matches("M(.*)(.*)M");
		System.out.println(b3);
	}

}
