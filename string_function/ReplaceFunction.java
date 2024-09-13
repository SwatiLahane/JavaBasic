package string_function;
   
   //replace and replace all string function
public class ReplaceFunction {

	public static void main(String[] args) 
	{
	    	//replace M with character Z
            String s =  "Manish";
            System.out.println(s.replace('M', 'Z'));
            
            //In the given string remove all the spaces
            
            String s1 = "Swati Vinayak Lahane";
            
            System.out.println(s1.replace(" ", ""));
            
           //Remove capital letters 
            
            String s3 = "Avinash Yadav";
            System.out.println(s3.replaceAll("[A-Z]", ""));
            
          //Remove All the Lower letters
            
            String s4 = "Swati Lahane";
            System.out.println(s4.replaceAll("[a-z]", ""));
            
          //Remove numeric letters from the given string
            String s5 = "Swati 1234lahane";
            System.out.println(s5.replaceAll("[0-9]", ""));
            
	}

}
