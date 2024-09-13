package string_function;

public class String2 {

	//Todays topic Replace and Replace All functions 
	
		public static void main(String[] args) 
		{
			String a = "Manish";
			
			System.out.println(a.replace("M", "Z"));

		//Q2 remove all the spaces 
			String a1 = "Manish Kumar Tiwari";
			System.out.println(a1.replace(" ", ""));
		
		//Q3 Remove All the Capital letters
			String a2 = "Avinash Yadav";
					System.out.println(a2.replaceAll("[A-Z]", ""));
			
		   //4 In the given string replace or remove all small letters
					
		//Q 5 In the Given String Remove All the Values 			
			String a3 = "kv no 2 Banaglore";
			System.out.println(a3.replaceAll("0-9", ""));
					
		}

}
