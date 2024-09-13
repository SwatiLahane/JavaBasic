package string_function;

public class CheckPalidrome {

	public static void main(String[] args) 
	{     
		  String input = "atul";   
		 //String input = "MOM";
		 //String input = "madam";
		 String output = "";
		 
		 for(int i = input.length()-1; i >= 0; i--)
		 {
			 char c1 = input.charAt(i);
			 output = output + c1;
			 
		 }
		 System.out.println("The Reverse String is  "+output);
		
		 if(input.equals(output))
		 {
			 System.out.println("The Given String is a Palimdrom");
		 }
		 else 
		 {
			 System.out.println("The Given String is not Palimdrom");
		 }
	}

}
