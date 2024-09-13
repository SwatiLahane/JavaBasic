package string_function;

public class EqualFunction 
{    
	
	//Equals function is used to compare two string and equals function return boolean
   public static void main(String arg[])
   {
	   String name = "Abhishek";
	   String name1 = "abhishek";
	   System.out.println(name.equals(name1)); 
	   
	   //concat ffunction
	  // System.out.println();
	   
	   String s1 = "Swati";
	   String s2 = "Swati";
	   
	   System.out.println(s1.equals(s2));
	   
	   String a = "AArav";   //java is case sensitive language the meaning of capiatal A n samall a is different
	   String a2 = "arav";
	   
	   System.out.println(a.equals(a2));
	   
	   
   }
}
