package practiceprograms;

public class StringFunctions {

	public static void main(String[] args) 
	{      
		
		  //lenght function 
		  //String s1 = new String("ramu");
		  
		 // String s1 = "ramu";  //index start from zero but counting start from 1
		  String s1 = "BANAGLORE";
		  String s2 = "banaglore";
           System.out.println(s1.length());
           
           //charAt
           System.out.println("Character at index :");
           System.out.println(s1.charAt(8));
           System.out.println(s1.charAt(2)); //index start from zero
           
           //it will give the character at index 2 ,if i enter 8 it will give character at 8
	
	   //2 . indexof
           System.out.println(s1.indexOf('G'));
           
           //tolowercase
           System.out.println(s1.toLowerCase()); 
           
           //to uppercase
           System.out.println(s1.toUpperCase());
            
          //Substring 
           System.out.println(s1.substring(4));
           //from indexing 4 till the end you will get answ
	       
          // Substring with two parameter
           System.out.println(s1.substring(1, 4));
           //in case of substring with two parameter from first index to second index -1 it 
           //will print here first index is one it will start from 1 and print 4-1
           //will print only 3 letters
           
	
	}

}
