package string_function;

public class StringReverse {

	public static void main(String[] args) 
	{
	    String str = "my name is swati";
	    String rev = " ";
	    
	    for(int i = str.length()-1; i >= 0; i--)
	    {
	    	char c1 = str.charAt(i);
	    	 rev = c1 + rev;
	    }
	    System.out.println("the revese string is :"+rev);

	}

}
