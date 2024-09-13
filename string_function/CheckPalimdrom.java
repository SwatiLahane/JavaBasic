package string_function;

public class CheckPalimdrom {

	public static void main(String[] args) 
	{
	     //String str = "MOM";
	     String str = "SWATI";
	     String rev = "";
	     
	     for(int i = str.length()-1; i >= 0; i--)
	     {
	    	 char ch = str.charAt(i);
	    	 rev = rev + ch;
	     }
	     
	    // System.out.println("Reverse string is "+rev);
	     if(str.equals(rev))
	     {
	    	  System.out.println("String is palimdrom ");
	     }
	     else
	     {
	    	 System.out.println("String is not palimdrome");
	     }
	     
	     

	}

}
